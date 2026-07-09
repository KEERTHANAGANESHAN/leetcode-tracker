// Last updated: 7/9/2026, 9:11:41 AM
class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long c=0;
        long a=0;
        for(int n:nums){
            if(n==0){
                c++;
                a+=c;
            }
            else{
                c=0;
            }
        }
        return a;
    }
}