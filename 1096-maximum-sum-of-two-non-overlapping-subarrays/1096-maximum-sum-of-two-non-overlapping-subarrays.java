class Solution {
    public int maxSumTwoNoOverlap(int[] nums, int firstLen, int secondLen) {
        int n = nums.length, m = firstLen + secondLen;
        
        // Calculate prefix sum
        int[] p = new int[n];
        p[0] = nums[0];
        for(int i = 1; i < n; i++)
         p[i] = p[i - 1] + nums[i];
        
        // dp1[i]: in the segment nums[0..i], find the subarray with length firstLen and the largest sum
        // --> dp1[i] = Return this largest sum
        int[] dp1 = new int[n - secondLen + 1];
        dp1[firstLen - 1] = p[firstLen - 1];

        for(int i = firstLen; i < n - secondLen + 1; i++)
          dp1[i] = Math.max(dp1[i - 1], p[i] - p[i - firstLen]);

        // dp2[i]: in the segment nums[0..i], find the subarray with length secondLen and the largest sum
        // --> dp2[i] = Return this largest sum
        int[] dp2 = new int[n - firstLen + 1];
        dp2[secondLen - 1] = p[secondLen - 1];

        for(int i = secondLen; i < n - firstLen + 1; i++)
          dp2[i] = Math.max(dp2[i - 1], p[i] - p[i - secondLen]);

        int maxSum = p[m - 1]; // The sum of the first m elements is obviously p[m - 1]
        for(int i = m; i <= n - 1; i++)
        {
           //-- Case 1: The "firstLen" segment contains the element nums[i]
           int sum1 = dp2[i - firstLen] + (p[i] - p[i - firstLen]);

           //-- Case 2: The "secondLen" segment contains the element nums[i]
           int sum2 = dp1[i - secondLen] + (p[i] - p[i - secondLen]);
           
           // Of course, Case 3: Neither "firstLen" nor "secondLen" contains nums[i]
           // In this case, the sum is maxSum
           maxSum = Math.max(maxSum, Math.max(sum1, sum2));
        }
        
        return maxSum;
    }
}