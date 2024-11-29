class Solution {
    public int findMaxConsecutiveOnes(int[] nums)
    {
        int n=nums.length,i,c=1,max=0,flag=0;
        for(i=0;i<n;i++)
        {
            if(nums[i]==1)
            {
                flag=1;
                break;
            }
        }

        if(flag==1)
        {
            if(n>1)
            {
                for(i=0;i<n-1;i++)
                {
                    if(nums[i]==1&&nums[i+1]==1)
                        c++;
                    else
                        c=1;
                    if(max<c)
                        max=c;
                } 
                return max; 
            }
            else
                return 1;
        }
        else
            return 0;
    }
}