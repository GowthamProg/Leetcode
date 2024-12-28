int search(int* a, int n, int t) {
    int index;
    if(a[0]<a[n-1]) index=0;
    for(int i=0;i<n-1;i++) 
        if(a[i]>a[i+1])  index=i+1;
    int left,right;
    if (index==0) {left=0;right =n-1;}
    else if(t>=a[0]) 
        {left=0;right=index-1;}  
    else if(t<a[0]) 
        {left=index;right=n-1;}

    printf("%d",index);

    while(left<=right)
    {
        int mid= (left+right)/2;
        if(t<a[mid])right=mid-1;
        else if (t>a[mid]) left=mid+1;
        if(t==a[mid]) return mid;
    }
    return -1;
}