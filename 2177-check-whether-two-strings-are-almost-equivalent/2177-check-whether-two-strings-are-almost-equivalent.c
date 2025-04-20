bool checkAlmostEquivalent(char* w1, char* w2) {
    int a[26]={0},b[26]={0};
    for(int i=0;i<strlen(w1);i++){
        a[w1[i]-'a']++;
        b[w2[i]-'a']++;
    }
    for(int i=0;i<26;i++){
        if(a[i]-b[i]>3 || a[i]-b[i]<-3) return false;
    }
    return true;
}