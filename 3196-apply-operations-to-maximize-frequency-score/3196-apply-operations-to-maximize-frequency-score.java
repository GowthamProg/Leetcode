class Solution {
    public int maxFrequencyScore(int[] nums, long k) {
        Arrays.sort(nums);
        int end =0;
        int start=0;
        long[] prefix = new long[nums.length];
        prefix[0]=(long)nums[0];
        for(int i=1;i<nums.length;i++){
            prefix[i] = prefix[i-1]+(long)nums[i];
        }
        int answer = 0;
        while(end<nums.length){
            int mid = start + (end-start)/2;
            long left = 0;
            long right = 0;
            if(mid-1>=0 && start-1>=0) left = prefix[mid-1]-prefix[start-1];
            else if(mid-1>=0 && start-1<0) left = prefix[mid-1];
            right = prefix[end]-prefix[mid];
            long steps = (nums[mid]*(long)(mid-start)-left)+ (right - nums[mid]*(long)(end-mid));
            while(steps>k){
                start++;
                mid = start + (end-start)/2;
                left = 0;
                right = 0;
                if(mid-1>=0 && start-1>=0) left = prefix[mid-1]-prefix[start-1];
                else if(mid-1>=0 && start-1<0) left = prefix[mid-1];
                right = prefix[end]-prefix[mid];
                steps = (nums[mid]*(long)(mid-start)-left)+ (right - nums[mid]*(long)(end-mid));
            }
            answer = Math.max(answer,end-start+1);
            end++;
        }

         return answer;
        
    }
}