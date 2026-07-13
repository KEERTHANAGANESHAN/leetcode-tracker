// Last updated: 7/13/2026, 11:08:01 AM
1class Solution {
2    public int search(int[] nums, int target) {
3        int ind=0,c=0;
4        for(int i=0;i<nums.length;i++){
5            if(nums[i]==target){
6                ind=i;
7                c++;
8            }   
9        }
10        if(c!=0){
11        return(ind);
12        }
13        return -1;
14    }
15}