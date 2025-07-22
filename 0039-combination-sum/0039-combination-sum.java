class Solution {
    int sum=0;
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        backtrack(list,new ArrayList<>(),candidates,target,0);
        return list;
    }
    public void backtrack(List<List<Integer>> list, List<Integer> temp, int[] arr, int target,int st){
        if(sum== target){
            list.add(new ArrayList<>(temp)); return;
        }
        for(int i=st;i<arr.length;i++){
            sum+=arr[i];
            if(sum>target){sum-=arr[i];continue;}
            temp.add(arr[i]);
            backtrack(list, temp,arr,target,i);
            sum-=arr[i];
            temp.remove(temp.size()-1);
        }
    }
}