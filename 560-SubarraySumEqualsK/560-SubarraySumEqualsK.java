// Last updated: 7/22/2026, 2:15:21 PM
1class Solution {
2    public int subarraySum(int[] nums, int k) {
3        int v=0;
4       for(int i=0;i<nums.length;i++){
5        int s=0;
6        for(int j=i;j<nums.length;j++){
7            s+=nums[j];
8            if(s==k){
9                v++;
10            }
11          }
12       }
13       return v; 
14    }
15}