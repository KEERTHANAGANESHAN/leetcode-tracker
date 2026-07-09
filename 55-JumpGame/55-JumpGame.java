// Last updated: 7/9/2026, 9:28:02 AM
class Solution {
    public boolean canJump(int[] nums) {
     int c=0;
     for(int i=0;i<nums.length;i++){
        if(i>c){
            return false;
        }
        c=Math.max(c,i+nums[i]);
     }
     return true;
    }
}