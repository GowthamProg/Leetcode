bool canJump(int* a, int n) {
   int k=1;
   if(n==1) return 1;
   for(int i=n-2;i>0;i--)
   {
    if(a[i]<k) k++;
    else k=1;
   }
   return (k<=a[0]);
}