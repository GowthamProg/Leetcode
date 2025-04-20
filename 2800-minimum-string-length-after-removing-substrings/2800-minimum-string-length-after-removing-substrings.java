class Solution {
    public int minLength(String s) {
        String result=s,current=s;
        int flag=1;
        int i=100;
        while(i>=0){
            current=result;
            result=result.replace("AB","");
            result=result.replace("CD","");
           i--;
        }
        return current.length();
    }
}