int* twoSum(int* n, int ns, int t, int* r) 
{
    *r=2;
    int *res=(int *) malloc(sizeof(int)*2);
    for(int i=0;i<ns-1;i++)
        for(int j=i+1;j<ns;j++)
            if(n[i]+n[j]==t)
            {
                res[0]=i;
                res[1]=j;
                return res;
            }
    return res;
}