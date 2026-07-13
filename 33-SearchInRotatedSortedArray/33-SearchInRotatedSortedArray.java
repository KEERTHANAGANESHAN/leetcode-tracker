// Last updated: 7/13/2026, 11:21:50 AM
class Solution {
    public int search(int[] nums, int target) {
        int ind=0,c=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                ind=i;
                c++;
            }   
        }
        if(c!=0){
        return(ind);
        }
        return -1;
    }
}