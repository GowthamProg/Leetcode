int rob(int* nums, int numsSize) 
{
    int temp,temp0,n=numsSize,t;
    if(n==1) return nums[0];
    if(n==2) return fmax(nums[0],nums[1]);
    temp=nums[0];
    temp0=fmax(nums[0],nums[1]);
    for(int i=2;i<n;i++)
    {
        t=fmax(temp+nums[i],temp0);
        temp=temp0;
        temp0=t;
    }
    return temp0;

}