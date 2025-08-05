class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum=0,len=nums.length;
        if(len==1) return nums[0];
        if(len==2) return Math.min(nums[0],nums[1]);
        for(int i=len-2;i>=0;i-=2)
            sum+=nums[i];
        return sum;
    }
}