// Last updated: 7/15/2026, 10:29:05 AM
1
2class Solution {
3    public int longestSubarray(int[] nums) {
4
5        int max = 2;
6        int curr = 2;
7
8        for (int i = 2; i < nums.length; i++) {
9
10            if ((long) nums[i - 1] + nums[i - 2] == nums[i]) {
11                curr++;
12            } else {
13                curr = 2;
14            }
15
16            max = Math.max(max, curr);
17        }
18
19        return max;
20    }
21}