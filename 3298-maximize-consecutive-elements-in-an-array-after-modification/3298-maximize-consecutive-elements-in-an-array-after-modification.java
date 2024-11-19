class Solution {
    public int maxSelectedElements(int[] nums) {
        Arrays.sort(nums);
        int max = 0;
        
        Map<Integer, Integer> map = new HashMap();
        for(int data: nums){
            map.put(data+1, map.getOrDefault(data, 0)+1);
            map.put(data, map.getOrDefault(data-1, 0)+1);
            
            max = Math.max(max, Math.max(map.get(data),map.get(data+1)));
        }
        
        
        
        return max;
    }
}