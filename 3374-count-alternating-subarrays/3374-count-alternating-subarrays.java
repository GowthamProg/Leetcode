class Solution {
    public long countAlternatingSubarrays(int[] nums) {
        long count=1;
        int ref=0; // changed when we encounter that digit at previous index is same as digit at current index
        int prev=nums[0];
        for(int i=1;i<nums.length;i++){
            if(prev!=nums[i])
                count+=(i-ref); // (i-ref) all possible subarrays formed between index ref and index i, since between i and ref, no same digit is side by side
            else
                ref=i; // as no more subarrays including this index can be generated, so fresh start from this index

            count+=1; // +1 (is for a subarray containing only the element at this particular index)
            prev=nums[i];
        }
        return count;
    }
}