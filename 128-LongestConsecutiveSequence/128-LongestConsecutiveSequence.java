// Last updated: 7/9/2026, 9:27:20 AM
class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        Arrays.sort(nums);
        int c = 1;
        int max = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                continue;
            }
            if (nums[i] + 1 == nums[i + 1]) {
                c++;
            } else {
                c = 1;
            }
            max = Math.max(max, c);
        }
        return max;
    }
}