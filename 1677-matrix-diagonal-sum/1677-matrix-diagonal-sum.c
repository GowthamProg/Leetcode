int diagonalSum(int** a, int r, int* c) {
    int count=0;
    for(int i=0;i<r;i++) count+=a[i][i];
    for(int i= *c-1,j=0;i>=0;j++,i--) count+=a[j][i];
    if(r%2==1) count=count-a[r/2][r/2];
    return count;
}