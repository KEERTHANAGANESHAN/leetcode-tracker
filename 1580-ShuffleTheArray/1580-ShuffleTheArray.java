// Last updated: 7/9/2026, 9:11:52 AM
class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[2 * n];
        int j = 0;
        
        for (int i = 0; i < n; i++) {
            result[j++] = nums[i];     // x_i
            result[j++] = nums[i + n]; // y_i
        }
        
        return result;
    }
}