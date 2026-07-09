// Last updated: 7/9/2026, 9:12:10 AM
class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int t=nums[0];
        int me=nums[0];
        int ms=nums[0];
        int mie=nums[0];
        int mis=nums[0];
        for(int i=1;i<nums.length;i++){
            t+=nums[i];
            me=Math.max(nums[i],me+nums[i]);
            ms=Math.max(ms,me);
            
            mie=Math.min(nums[i],mie+nums[i]);
            mis=Math.min(mis,mie);

        }
        if(ms<0){
            return ms;
        }
        return Math.max(ms,t-mis);
    }
}