int findMin(int* num, int nS) {
    if(num[0]>=num[nS-1])
        for(int i=0;i<nS-1;i++)
            if(num[i]>num[i+1])return num[i+1];
    return num[0];
}