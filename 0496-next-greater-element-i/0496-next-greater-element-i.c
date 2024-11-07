/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* nextGreaterElement(int* n1, int n1s, int* n2, int n2s, int* rsize) {
    *rsize=n1s;
    int *a=(int *)malloc(n1s*sizeof(int));
    int k=0,l=0;
    for(int i=0;i<n1s;i++)
    {
        a[i]=-1;
        k=0;
        for(int j=0;j<n2s;j++)
        {
            if(n1[i]==n2[j] ) k=1;
            if(k>0 && n1[i]<n2[j])
             {
                a[i]=n2[j];
                break;
             }
        }
    }
    return a;
}