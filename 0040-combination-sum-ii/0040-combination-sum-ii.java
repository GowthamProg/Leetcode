class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
      List<List<Integer>> result = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(result,temp,candidates,target,0,0);
        return result;
    }
    public void backtrack(List<List<Integer>> result, List<Integer> temp,int[] candidates,int target, int sum,int start){
        if(sum==target ){
            result.add(new ArrayList<>(temp));
            return;
        }
        if(sum> target) return;
        for(int i=start;i<candidates.length;i++){
            if(i>start && candidates[i]==candidates[i-1])continue;
            temp.add(candidates[i]);
            sum+=candidates[i];
            backtrack(result,temp,candidates,target,sum,i+1);
            sum-=candidates[i];
            temp.removeLast();
        }  
    }
}