// int findMin(int* num, int nS) {
//     if(num[0]>num[nS-1])
//         for(int i=0;i<nS;i++)
//             if(num[i]>num[i+1])return num[i+1];
//     return num[0];
// }


int findMin(int* a, int n)
{
    int left=0,right=n-1;
    if(a[0]<a[right]) return a[0];
    while(left<=right)
    {
        int mid=(right+left)/2;
        if(a[mid]>a[n-1])left= mid+1;
        else  right=mid-1;
    }
    return a[left];
}







// int findMin(int* num, int nS) {
//         int right=nS-1,left=0,mid;
//         if(num[0]<num[nS-1])return num[0];
//         while(left<right)
//         {
//             mid = (left + right)/2;
//             if(num[mid]>num[mid+1])return num[mid+1];
//             if(num[mid-1]>num[mid])return num[mid];
//             if(num[mid]>num[0]) {left=mid+1;}
//             else if(num[mid]<num[0]){right=mid+1;}
//         }
//         return num[mid];

// }