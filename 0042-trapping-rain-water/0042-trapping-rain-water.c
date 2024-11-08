int large(int *a,int n)
{
    int h=0,in=0;
    for(int i=0;i<n;i++)
    {
        if(h<=a[i]) {h=a[i];in=i;}
    }
    return in;
}

int trap(int* a, int n) 
{
    int sum=0,fb=a[0],sb=a[n-1];
    int high,*last=a+n-1;
    high=large(a,n);
    for(int i=1;i<high;i++)
    {
        if(fb>a[i])  {sum=sum+fb-a[i]; continue;}
        if(fb==a[i]) continue;
        if(fb<a[i])  fb=a[i];
    }
    for(int i=n-2;i>high;i--)
    {
        if(sb>a[i]) {sum=sum+sb-a[i];continue;}
        if(sb==a[i]) continue;
        if(sb<a[i]) sb=a[i];
    }


    return sum;
}