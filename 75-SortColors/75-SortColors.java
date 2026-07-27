// Last updated: 7/27/2026, 11:18:03 AM
1class Solution {
2    public void sortColors(int[] nums) {
3        int low=0,mid=0,high=nums.length-1;
4        while(mid<=high){
5            if(nums[mid]==0){
6                int t=nums[low];
7                nums[low]=nums[mid];
8                nums[mid]=t;
9                low++;
10                mid++;
11            }
12            else if(nums[mid]==1){
13                mid++;
14            }
15            else{
16                int t=nums[mid];
17                nums[mid]=nums[high];
18                nums[high]=t;
19                high--;
20            }
21        }
22    }
23}