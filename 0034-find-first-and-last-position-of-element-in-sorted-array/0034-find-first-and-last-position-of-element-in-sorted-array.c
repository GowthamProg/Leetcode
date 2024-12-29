/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* searchRange(int* a, int n, int tr, int* rs) {
    *rs=2;
    int flag=0,res=-1;
    int *b=(int*)malloc(2*sizeof(int));
    b[0]=-1;b[1]=-1;
    for(int i=0;i<n;i++)
    {
        if(tr==a[i] && flag==0) 
        {
            b[0]=i;res=i;flag=1;
        }        
        if(flag==1 && tr==a[i]) res=i;
        else flag=0; 
    }
    b[1]=res;
    return b;
}