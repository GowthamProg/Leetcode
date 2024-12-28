int search(int* n, int nS, int tg) {
    int left=0,right=nS-1,mid;
    while(left<=right)
    {
        mid=(left+right)/2;
        if(n[mid]<tg){ left=mid+1;}
        else if(n[mid]>tg){right=mid-1;}
        else if(n[mid]==tg) return mid;
    }
    return -1;
}