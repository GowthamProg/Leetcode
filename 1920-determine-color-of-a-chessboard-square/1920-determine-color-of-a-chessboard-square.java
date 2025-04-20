class Solution {
    public boolean squareIsWhite(String ca) {
        char c[]=ca.toCharArray();
        int a = c[0]-'a';
        int b= c[1]-'1';
        if((a+b)%2==0){
            return false;
        }
        return true;
    }
}