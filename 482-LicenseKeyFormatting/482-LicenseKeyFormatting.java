// Last updated: 7/10/2026, 4:15:20 PM
1class Solution {
2    public String licenseKeyFormatting(String s, int k) {
3        s = s.replace("-", "").toUpperCase();
4        StringBuilder ans = new StringBuilder();
5        int count = 0;
6        for (int i = s.length() - 1; i >= 0; i--) {
7            ans.append(s.charAt(i));
8            count++;
9            if (count == k && i != 0) {
10                ans.append('-');
11                count = 0;
12            }
13        }
14        return ans.reverse().toString();
15    }
16}