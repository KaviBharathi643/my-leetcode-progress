class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum = 0;
        
        // 1. Compute the sum of the very first window (first k elements)
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        
        double maxSum = sum;
        
        // 2. Slide the window across the rest of the array
        for (int i = k; i < nums.length; i++) {
            // Add the new incoming element, subtract the old outgoing element
            sum += nums[i] - nums[i - k];
            maxSum = Math.max(maxSum, sum);
        }
        
        // 3. Divide by k at the very end to get the maximum average
        return maxSum / k;
    }
}

