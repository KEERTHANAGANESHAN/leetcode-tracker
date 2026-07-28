// Last updated: 7/28/2026, 11:42:43 AM
1class Solution {
2    public int titleToNumber(String c) {
3        
4    int r = 0;
5    for(int i=0;i<c.length();i++){
6        r=r*26+(c.charAt(i)-'A'+1);
7    }
8    return r;
9}
10}
11