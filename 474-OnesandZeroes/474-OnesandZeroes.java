// Last updated: 7/28/2026, 2:08:22 PM
1class Solution {
2    public int findMaxForm(String[] strs, int m, int n) {
3        int[][] dp = new int[m + 1][n + 1];
4        for (String s : strs) {
5            int zeros = 0;
6            int ones = 0;
7            for (char c : s.toCharArray()) {
8                if (c == '0')
9                    zeros++;
10                else
11                    ones++;
12            }
13            for (int i = m; i >= zeros; i--) {
14                for (int j = n; j >= ones; j--) {
15                    dp[i][j] = Math.max(
16                            dp[i][j],
17                            dp[i - zeros][j - ones] + 1
18                    );
19                }
20            }
21        }
22        return dp[m][n];
23    }
24}