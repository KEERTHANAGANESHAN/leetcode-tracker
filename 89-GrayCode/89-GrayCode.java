// Last updated: 8/7/2026, 2:14:17 PM
1class Solution {
2    public List<Integer> grayCode(int n) {
3        List<Integer> ans = new ArrayList<>();
4        int total = 1 << n;
5        for (int i = 0; i < total; i++) {
6            ans.add(i ^ (i >> 1));
7        }
8        return ans;
9    }
10}