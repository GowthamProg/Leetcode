    class Solution {
        public List<List<String>> partition(String s) {
            List<List<String>> result = new ArrayList<>();
            List<String> temp = new ArrayList<>();
            backtrack(result,temp,s,0);
            return result;
        }
        void backtrack(List<List<String>> result,List<String> temp,String s,int start){
            if(start == s.length()){
                result.add(new ArrayList(temp));
                return;
            }
            for(int i=start;i<s.length();i++){
                String k = s.substring(start,i+1);
                if(check(k)){
                    temp.add(k);
                    backtrack(result,temp,s,i+1);
                    temp.remove(temp.size()-1);
                }
            }
        }
        boolean check(String s){
            int start =0,end = s.length()-1;
            while(start<end){
                if(s.charAt(start++)!=s.charAt(end--))
                    return false;
            }
            return true;
        }
    }