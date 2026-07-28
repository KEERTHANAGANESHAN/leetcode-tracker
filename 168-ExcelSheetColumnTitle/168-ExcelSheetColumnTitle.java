// Last updated: 7/28/2026, 11:44:10 AM
1class Solution {
2    public String convertToTitle(int c) {
3    StringBuilder sb = new StringBuilder();
4    while (c>0) {
5        c--;
6        sb.append((char)('A'+c%26));
7        c/=26;
8    }
9    return sb.reverse().toString();
10}
11}
12