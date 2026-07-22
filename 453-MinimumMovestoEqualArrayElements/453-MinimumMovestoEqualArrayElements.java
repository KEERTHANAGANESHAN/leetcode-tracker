// Last updated: 7/22/2026, 11:46:02 AM
1class Solution {
2    public int minMoves(int[] nums) {
3        int s=0;
4        int m=nums[0];
5        for(int i=0;i<nums.length;i++){
6            s+=nums[i];
7        }
8        for(int i=0;i<nums.length;i++){
9            if(nums[i]<m){
10                m=nums[i];
11            }
12        }
13        int h=s-(m*nums.length);
14        return h;
15    }
16}