class Solution {
    public String getSmallestString(String s, int k) {
        char[] arr = s.toCharArray();
        
        for(int i=0; i<s.length() && k > 0; i++) {
            if(arr[i] == 'a')
                continue;
            int curr = arr[i] - 'a';
            
            boolean canBeA = curr + k >= 26;
            if(canBeA) {
                arr[i] = 'a';
                int leftDist = Math.min(curr, k);
                int rightDist = 26 - curr;
                
                int minDist = Math.min(leftDist, rightDist);
                k -= minDist;
            } else {
                if(curr <= k) {
                    arr[i] = 'a';
                    k -= curr;
                } else {
                    arr[i] = (char)(curr - k + 'a');
                    k = 0;
                }
            }
        }
        
        return new String(arr);
    }
}