class Solution {
    public int minLength(String s) {
        String result=s,current=s;
        int flag=1;
        while(flag==1){
            current=result;
            result=result.replace("AB","");
            result=result.replace("CD","");
            if(current.equals(result)){
                flag=0;
                break;
            }
        }
        return current.length();
    }
}