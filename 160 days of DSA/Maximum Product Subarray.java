Date: 25.11.24

class Solution {
    // Function to find maximum product subarray
    public int maxProduct(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int maxProduct = nums[0];
        int currentMaximum = nums[0];
        int currentMinimum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < 0) {
                int temp = currentMaximum;
                currentMaximum = currentMinimum;
                currentMinimum = temp;
            }

            currentMaximum = Math.max(nums[i], currentMaximum * nums[i]);
            currentMinimum = Math.min(nums[i], currentMinimum * nums[i]);

            maxProduct = Math.max(maxProduct, currentMaximum);
        }

        return maxProduct;
    }
}
