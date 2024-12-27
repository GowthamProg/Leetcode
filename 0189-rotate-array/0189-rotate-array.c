void rotate(int* n, int ns, int k) 
{
    int a[ns],z=0;
    k=k%ns;
    for(int i=ns-k;i<ns;i++) a[z++]=n[i];
    for(int j=0;j<ns-k;j++) a[z++]=n[j];
    for(int i=0;i<ns;i++) n[i]=a[i]; 
}








/* 
void reverse(int *nums,int start,int end)
{
    int temp;
    while(start<end)
    {
        temp=nums[start];
        nums[start++]=nums[end];
        nums[end--]=temp;
    }
}
void rotate(int* nums, int numsSize, int k) 
{
    int start =0;
    k=k%numsSize;
    reverse(nums,start,numsSize-k-1);
    reverse(nums,numsSize-k,start+numsSize-1);
    reverse(nums,start,numsSize-1);
}
*/