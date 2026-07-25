// Last updated: 7/25/2026, 11:28:17 AM
1class Solution {
2    public boolean checkSubarraySum(int[] nums, int k) {
3        HashMap<Integer,Integer> map=new HashMap<>();
4        map.put(0,-1);
5        int s=0;
6        for(int i=0;i<nums.length;i++){
7            s+=nums[i];
8            int r=s%k;
9            if(map.containsKey(r)){
10                if((i-map.get(r))>=2)
11                return true;
12            }
13            else{
14                map.put(r,i);
15            }
16        }
17        return false;
18    }
19}