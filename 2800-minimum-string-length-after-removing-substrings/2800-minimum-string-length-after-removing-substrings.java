class Solution {
    public int minLength(String s) {
        String result=s,current=s;
        int flag=1;
        while(true){
            current=result;
            result=result.replace("AB","");
            result=result.replace("CD","");
            if(current.equals(result)){
                break;
            }
        }
        return current.length();
    }
}