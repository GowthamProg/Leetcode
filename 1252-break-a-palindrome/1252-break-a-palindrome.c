char* breakPalindrome(char* p) {
    int len=strlen(p);
    if(len<=1) return "";
    for(int i=0;i<len/2;i++){
        if(p[i]!='a'){
            p[i]='a';
            return p;
        }
    }
    p[len-1]='b';
    return p;
}