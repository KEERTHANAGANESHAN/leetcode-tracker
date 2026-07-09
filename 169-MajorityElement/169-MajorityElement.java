// Last updated: 7/9/2026, 9:26:37 AM
class Solution {
    public int majorityElement(int[] nums) {
        int a=0;
        for(int i=0;i<nums.length;i++){
             a=nums[i];
             int c=0;
            for(int j=i+1;j<nums.length;j++){
                if(a==nums[j]){
                c++;
                }
            }
            if(c>=nums.length/2){
             return a;
            }
        }
         return -1;
    }
}