// Last updated: 7/18/2026, 5:27:24 PM

class Solution {
    public int longestSubarray(int[] nums) {

        int max = 2;
        int curr = 2;

        for (int i = 2; i < nums.length; i++) {

            if ((long) nums[i - 1] + nums[i - 2] == nums[i]) {
                curr++;
            } else {
                curr = 2;
            }

            max = Math.max(max, curr);
        }

        return max;
    }
}