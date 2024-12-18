class Solution {
    private static final int MOD = (int)1e9 + 7;
    public int minCostToEqualizeArray(int[] nums, int cost1, int cost2) {
        Arrays.sort(nums);
        int n = nums.length;
        if (n == 1) return 0;
        if (n == 2) return (int)((long)(nums[1] - nums[0]) * cost1 % MOD);
        if (cost2 >= cost1 * 2) {
            long res = 0;
            for (int num: nums) {
                res = (res + (long)(nums[n-1] - num) * cost1) % MOD;
            }
            return (int)res;
        }
        
        long sum = 0;
        long max = 0;
        for (int num: nums) {
            sum += nums[n-1] - num;
            max = Math.max(max, nums[n-1] - num);
        }
        
        long res = Long.MAX_VALUE;
        for (int k = nums[n-1]; k <= nums[n-1] + 2; k++) {
            res = Math.min(res, minCost(sum + (k-nums[n-1]) * n, max + (k-nums[n-1]), cost1, cost2));
        }
        
        if (max > sum - max) {
            for (int k = (int)((2 * max - sum) / (n-2)); k <= (int)((2 * max - sum) / (n-2)) + 2; k++) {
                res = Math.min(res, minCost(sum + k * n, max + k, cost1, cost2));
            }
        }
        
        return (int)(res % MOD);
    }
    
    private long minCost(long sum, long max, int cost1, int cost2) {
        long res = 0;
        if (sum % 2 == 1) {
            res += cost1;
            max--;
            sum--;
        }
        if (max <= sum - max) {
            res = (res + sum / 2 * cost2);
            return res;
        }
        res = (res + (max - (sum-max)) * cost1);
        res = (res + (sum-max) * cost2);
        return res;
    }
}