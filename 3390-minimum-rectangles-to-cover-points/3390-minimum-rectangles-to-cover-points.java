class Solution {
    public int minRectanglesToCoverPoints(int[][] points, int w) {
        Arrays.sort(points,(a,b)->a[0]-b[0]); // sort as per x-value
        int count=0;
        int ref=points[0][0]; // reference point (x1) --> if condition fails, we update it 
        for(int i=1;i<points.length;i++){
            if(points[i][0]-ref>w){ // if x2-x1 > w
                count++; //  till i-1 we get a rectangle
                ref=points[i][0]; // update reference point and start new rectangle from here
            }
        }
        return count+1; // last rectangle, as we do not get the break point inside for loop
    }
}