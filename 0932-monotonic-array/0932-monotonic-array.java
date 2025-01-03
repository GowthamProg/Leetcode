class Solution {
  public boolean isMonotonic(int[] nums) {
    int arr[]=new int[nums.length];
    for(int i=0;i<nums.length;i++){
      arr[i]=nums[i];
    }
    
    Arrays.sort(arr);
    boolean ans1=true;
    boolean ans2=true;

    for(int i=0;i<nums.length;i++){
      if(arr[i]!=nums[i]){
        ans1=false;
        break;
      }
    }

    int index=0;

    for(int i=nums.length-1;i>=0;i--){
      if(arr[index]!=nums[i]){
        ans2=false;
        break;
      }
      index++;
    }
    return ans1||ans2;
  }
}