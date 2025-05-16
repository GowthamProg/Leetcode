class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        int[] arr=new int[61];
        int result=0;
        for(int i=0;i<time.length;i++){
            result+=arr[60-time[i]%60];
            if(time[i]%60==0) result+=arr[0];
            arr[time[i]%60]++;
        }
        
        return result;
    }
}