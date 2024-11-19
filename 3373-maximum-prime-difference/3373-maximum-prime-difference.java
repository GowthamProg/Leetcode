class Solution {

    public int maximumPrimeDifference(int[] nums) {
       List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) 
            if (isPrime(nums[i])) 
                list.add(i);
         return Collections.max(list)-Collections.min(list);
        }
    public boolean isPrime(int num){
          if (num <= 1) return false;
            if (num == 2) return true;
            if (num % 2 == 0) return false;
            for (int i = 3; i * i <= num; i += 2) {
                if (num % i == 0) return false;
            }
            return true;

    }
}