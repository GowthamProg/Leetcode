class Solution {
    private int backtrack(int n,int []arr){
        if(n<0) return 0;
        if(n== 0) return 1;
        if(arr[n]!=0) return arr[n];
        return arr[n]= backtrack(n-1,arr) + backtrack(n-2,arr);
    }
    public int climbStairs(int n) {
        int arr[] = new int[n+1];
        Arrays.fill(arr,0);
        int ans = backtrack(n,arr);
        return ans;
    }
}