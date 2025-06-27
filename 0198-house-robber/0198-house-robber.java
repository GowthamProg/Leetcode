class Solution {

    public int f(int i, int nums[],int dp[]){
        if(i<0) return 0;
        if(i==0) return nums[i];
        if(dp[i]!=-1) return dp[i];
        int pick = nums[i]+ f(i-2,nums,dp);
        int notpick = f(i-1,nums,dp);
        return dp[i] = Math.max(pick,notpick);
    }
    public int rob(int[] nums) {
        int n= nums.length;
        int [] dp =new int[n];
        Arrays.fill(dp,-1);
        int ans=f(n-1,nums,dp);
        return ans;
    }
}