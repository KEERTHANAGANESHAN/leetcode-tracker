// Last updated: 7/22/2026, 1:58:30 PM
1class Solution {
2    public int minMoves2(int[] nums) {
3       int m=0;
4       Arrays.sort(nums);
5       int s=nums[nums.length/2];
6       for(int n:nums){
7        m+=Math.abs(n-s);
8       }
9       return m;
10    }
11}