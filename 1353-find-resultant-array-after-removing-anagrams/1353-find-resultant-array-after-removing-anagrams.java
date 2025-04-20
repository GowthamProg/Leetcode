class Solution {
    public List<String> removeAnagrams(String[] words) {
       List <String> result = new ArrayList<>();
       String previous= sortstring(words[0]);
       result.add(words[0]);
       for(int i=1;i<words.length;i++){
        String current = sortstring(words[i]);
        if(!previous.equals(current)){
            previous=current;
            result.add(words[i]);
        }
       } 
       return result;
    }
    private String sortstring(String s){
        char []ch= s.toCharArray();
        Arrays.sort(ch);
        return new String(ch);
        }
}