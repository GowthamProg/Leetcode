class Solution {
  public int[] findPermutation(int[] nums) {
    final int n = nums.length;
    int[][] mem = new int[n][1 << n]; // DP table to store minimum scores
    int[][] bestPick = new int[n][1 << n]; // Table to store best picks

    // Initiate the recursive function starting with the first element (index 0) and the mask representing the first element chosen (1)
    getScore(nums, 0, 1, bestPick, mem);
    return construct(bestPick); // Construct the result permutation
  }

  private int getScore(int[] nums, int last, int mask, int[][] bestPick, int[][] mem) {
    if (Integer.bitCount(mask) == nums.length) // Base case: all numbers are chosen
      return Math.abs(last - nums[0]);
    if (mem[last][mask] > 0) // Return memoized result if already computed
      return mem[last][mask];

    int minScore = Integer.MAX_VALUE;
    for (int i = 1; i < nums.length; ++i) {
      if ((mask & (1 << i)) != 0) // Skip if this number is already chosen
        continue;
      int nextMinScore = Math.abs(last - nums[i]) + getScore(nums, i, mask | (1 << i), bestPick, mem);
      if (nextMinScore < minScore) { // Update minimum score and best pick
        minScore = nextMinScore;
        bestPick[last][mask] = i;
      }
    }

    return mem[last][mask] = minScore; // Memoize the result
  }

  private int[] construct(int[][] bestPick) {
    int[] ans = new int[bestPick.length];
    for (int i = 0, last = 0, mask = 1; i < bestPick.length; ++i) {
      ans[i] = last; // Add the best pick to the result array
      last = bestPick[last][mask]; // Update last to the next best pick
      mask |= 1 << last; // Update mask to include the new pick
    }
    return ans; // Return the constructed permutation
  }
}