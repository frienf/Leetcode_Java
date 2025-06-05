class Solution {
    public int maxProduct(int[] nums) {
        if (nums.length == 0) return 0;  
        int maxProduct = nums[0];
        int currentMax = nums[0];
        int currentMin = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int num = nums[i];
            int tempMax = currentMax;
            currentMax = Math.max(num, Math.max(num * currentMax, num * currentMin));
            currentMin = Math.min(num, Math.min(num * tempMax, num * currentMin));
            maxProduct = Math.max(maxProduct, currentMax);
        }
        return maxProduct;
    }
}