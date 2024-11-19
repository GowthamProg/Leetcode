class Solution {
    public int numberOfPairs(int[][] points) {
        int n = points.length;
        int res=0;
        Arrays.sort(points, (a,b)->{
            if(a[0]==b[0]){
                return b[1]-a[1];
            } else{
                return a[0]-b[0];
            }
        });
        
        for(int i=0; i<n; i++){
            int min = Integer.MIN_VALUE;
            for(int j=i+1; j<n; j++){
                if(points[j][1] > points[i][1]){
                    continue;
                }
                if(points[j][1] > min){
                    min = points[j][1];
                    res++;
                }
            }
        }
        return res;
    }
}