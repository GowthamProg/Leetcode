/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* nextGreaterElements(int* n, int S, int* rS) {
    *rS=S;
    int *ans=(int*)malloc(S*sizeof(int));
    for(int i=0;i<S;i++)
    {
        ans[i]=-1;
        int l=0;
        for(int j=i+1;j<S;j++)
        {
            if(n[i]<n[j]) 
            {
                ans[i]=n[j];
                l=1;
                break;
            }
        }
        for(int j=0;j<i && l==0;j++)
        {
             if(n[i]<n[j]) 
            {
                ans[i]=n[j];
                l=1;
                break;
            }
        }
    }
    return ans;
}