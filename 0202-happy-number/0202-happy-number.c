int compute(int n)
{
    int res=0;
    while(n>0)
    {
        res=res+(n%10)*(n%10);
        n=n/10;
    }
    return res;
}
bool isHappy(int n) {
    int slow=n,fast=n;
    do {
        slow=compute(slow);
        fast=compute(fast);
        fast=compute(fast);
    }while(slow!=fast);
    if(slow==1) return slow;
    else return 0;
}



// int compute(int n)
// {
//     int res=0;
//     while(n>0)
//     {
//         res=res+(n%10)*(n%10);
//         n=n/10;
//     }
//     return res;
// }
// bool isHappy(int n) {
//     do {
//         n=compute(n);
//     }while(n!=1 && n!=4);
//     if(n==1) return 1;
//     else return 0;
// }