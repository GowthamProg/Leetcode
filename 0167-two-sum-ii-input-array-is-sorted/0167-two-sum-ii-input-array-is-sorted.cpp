class Solution {
public:
    vector<int> twoSum(vector<int>& a, int target) {
        int left =0,right=a.size()-1;
        while(left<right)
        {
            int sum=a[left]+a[right];
            if (sum==target) return{left+1,right+1};
            else if(sum<target)left +=1;
            else right-= 1;
        }
        return {-1,-1};
    }
};