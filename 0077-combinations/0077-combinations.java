class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        backtrack(result,list,n,k,1);
        return result;
    }
    void backtrack(List<List<Integer>> result,List<Integer> list,int n,int k,int start){
        if(list.size()==k){
            result.add(new ArrayList<>(list));
            return;
        }
        for(int i=start;i<=n;i++){
            list.add(i);
            backtrack(result,list,n,k,i+1);
            list.removeLast();
        }
    }
    
}