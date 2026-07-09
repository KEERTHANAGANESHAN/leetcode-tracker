// Last updated: 7/9/2026, 9:24:46 AM
class Solution {
    public int trailingZeroes(int n) {
       int c=0;
       while(n>0){
        n=n/5;
        c+=n;
       }
       return c;
    }
}