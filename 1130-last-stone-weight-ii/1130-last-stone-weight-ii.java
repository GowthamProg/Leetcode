class Solution {
    public int lastStoneWeightII(int[] stones) {
        int sum = 0;
        // Step 1: Calculate total sum
        for (int stone : stones) {
            sum += stone;
        }
        
        boolean[][] dp = new boolean[stones.length + 1][sum + 1];
        
        // Step 2: Base case — sum 0 is always possible
        for (int i = 0; i <= stones.length; i++) {
            dp[i][0] = true;
        }
        
        // Step 3: Fill DP table
        for (int i = 1; i <= stones.length; i++) {
            for (int j = 1; j <= sum / 2; j++) {
                if (stones[i - 1] <= j) {
                    dp[i][j] = dp[i - 1][j - stones[i - 1]] || dp[i - 1][j];
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        
        // Step 4: Find best possible sum close to sum/2
        for (int j = sum / 2; j >= 0; j--) {
            if (dp[stones.length][j]) {
                return sum - 2 * j;
            }
        }
        
        return 0;
    }
}