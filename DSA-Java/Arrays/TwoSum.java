class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Step 1: Loop through each element in the array
        for(int i = 0; i < nums.length; i++) {
            // Step 2: For the current element nums[i], check all elements that come after it
            for(int j = i + 1; j < nums.length; j++) {
                // Step 3: Check if the sum of nums[i] and nums[j] equals the target
                if(nums[i] + nums[j] == target) {
                    // Step 4: If yes, return their indices as the result
                    return new int[]{i, j};
                }
            }
        }
        // Step 5: If no such pair is found, return an empty array
        return new int[]{};
    }
}
