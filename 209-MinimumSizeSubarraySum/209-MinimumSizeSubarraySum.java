// Last updated: 7/9/2026, 9:24:32 AM
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int j=0;
        int s=0;
        int minlen=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            s+=nums[i];
            while(s>=target){
                minlen=Math.min(minlen,i-j+1);
                s-=nums[j];
                j++;
            }
           
        }
        return minlen==Integer.MAX_VALUE?0:minlen;
    }
}