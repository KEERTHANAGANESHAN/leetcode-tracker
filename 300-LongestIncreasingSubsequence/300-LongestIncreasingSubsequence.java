// Last updated: 7/14/2026, 11:02:17 AM
1class Solution {
2    public int lengthOfLIS(int[] nums) {
3        int n = nums.length;
4        int[] dp = new int[n];
5        for (int i = 0; i < n; i++) {
6            dp[i] = 1;
7        }
8        int max = 1;
9        for (int i = 1; i < n; i++) {
10            for (int j = 0; j < i; j++) {
11                if (nums[i] > nums[j]) {
12                    dp[i] = Math.max(dp[i], dp[j] + 1);
13                }
14            }
15            max = Math.max(max, dp[i]);
16        }
17        return max;
18    }
19}