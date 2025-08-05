class Solution {
    public int numOfUnplacedFruits(int[] f, int[] b) {
        int l = f.length;
        int ans =0 ;
        for(int i =0;i<l;i++){
            for(int j =0;j<l;j++){
                if(f[i]<=b[j]) {
                    ans++;
                    b[j]=-1;
                    break;
                }
            }
        }
        return l-ans;
    }
}