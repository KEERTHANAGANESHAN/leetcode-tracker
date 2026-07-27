// Last updated: 7/27/2026, 2:05:26 PM
1class Solution {
2    public int minEatingSpeed(int[] piles, int h) {
3        int low=1;
4        int high=0;
5        for(int x:piles){
6            high=Math.max(x,high);
7        }
8        int ans=high;
9        while(low<=high){
10            int mid=low+(high-low)/2;
11            long hours=0;
12            for(int p:piles){
13                hours+=(long)Math.ceil((double)p/mid);
14            }
15            if(hours<=h){
16                ans=mid;
17                high=mid-1;
18            }
19            else{
20                low=mid+1;
21            }
22        }
23        return ans;
24    }
25}