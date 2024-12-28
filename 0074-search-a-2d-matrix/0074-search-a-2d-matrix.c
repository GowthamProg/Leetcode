bool searchMatrix(int** mat, int m, int*n, int tar) {
   int left=0,right=m* *n-1;
    while(left<=right)
    {
        int mid=(left+right)/2;
        int row=mid/ *n, col=mid% *n;
        if(mat[row][col]<tar){ left=mid+1;}
        if(mat[row][col]>tar){ right=mid-1;}
        if(mat[row][col]==tar) return 1;
    }
    return 0;
}