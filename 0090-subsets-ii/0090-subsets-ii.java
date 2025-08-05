class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(result,temp,nums,0);
        return result;
    }
    public void backtrack(List<List<Integer>> result,List<Integer> temp,int num[],int start){
        result.add(new ArrayList<>(temp));
        for(int i= start;i<num.length;i++){
            if(i>start && num[i]==num[i-1]) continue;
            temp.add(num[i]);
            backtrack(result,temp,num,i+1);
            temp.remove(temp.size()-1);
        }
    }
}