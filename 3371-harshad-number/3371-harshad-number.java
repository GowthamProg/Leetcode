class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int sum=0,n=x;
        while(n!=0){
            sum=sum+n%10;
            n=n/10;
        }
        if(x%sum==0){
            return sum;
        }
        return -1;
    }
}