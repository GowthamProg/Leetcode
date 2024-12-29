int minEatingSpeed(int* a, int n, int h) {
    int min=1,max=0,res=0;
    for(int i=0;i<n;i++) if(max<=a[i]) max=a[i];
    while(min<max)
    {
        int rate = (min+max)/2,sum=0;
        for(int i=0;i<n;i++) 
        {
            sum=sum+a[i]/rate + (a[i]% rate!=0);
            if(sum>h) break;
        }
        if(sum<=h) max=rate;
        else if(sum>h) min=rate+1;
    }
    return min;
}