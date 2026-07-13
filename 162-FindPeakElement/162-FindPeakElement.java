// Last updated: 7/13/2026, 11:15:48 AM
1class Solution {
2    public int findPeakElement(int[] nums) {
3        int m=nums[0];
4        int ind=0;
5        for(int i=0;i<nums.length;i++){
6            if(nums[i]>m){
7                m=nums[i];
8                ind=i;
9            }
10        }
11        return ind;
12    }
13}