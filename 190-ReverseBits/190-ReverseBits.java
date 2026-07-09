// Last updated: 7/9/2026, 9:24:43 AM
class Solution {
    public int reverseBits(int n) {
       int r=0;
       for(int i=0;i<32;i++){
        r=r << 1;
        r=r|(n & 1);
        n=n >>> 1;
       }
       return r;
    }
}