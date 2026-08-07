// Last updated: 8/7/2026, 11:43:47 AM
1class Solution {
2    public int divide(int dividend, int divisor) {
3        if (dividend == Integer.MIN_VALUE && divisor == -1)
4            return Integer.MAX_VALUE;
5        long a = Math.abs((long) dividend);
6        long b = Math.abs((long) divisor);
7        int ans = 0;
8        while (a >= b) {
9            int shift = 0;
10            while (a >= (b << (shift + 1))) {
11                shift++;
12            }
13            a -= (b << shift);
14            ans += (1 << shift);
15        }
16        if ((dividend > 0) ^ (divisor > 0))
17            ans = -ans;
18        return ans;
19    }
20}