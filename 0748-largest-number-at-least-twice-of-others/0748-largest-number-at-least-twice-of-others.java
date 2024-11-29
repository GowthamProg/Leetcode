class Solution {
    public int dominantIndex(int[] nums) {
        if (nums.length == 1) return 0; // Only one element, return its index

        int largest = -1;
        int secondLargest = -1;
        int index = -1;

        // Find the largest number and its index
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > largest) {
                secondLargest = largest; // Update second largest
                largest = nums[i];
                index = i; // Update index of largest
            } else if (nums[i] > secondLargest) {
                secondLargest = nums[i]; // Update second largest if applicable
            }
        }

        // Check if the largest number is at least twice as large as the second largest
        if (largest >= 2 * secondLargest) {
            return index;
        }

        return -1;
    }
}