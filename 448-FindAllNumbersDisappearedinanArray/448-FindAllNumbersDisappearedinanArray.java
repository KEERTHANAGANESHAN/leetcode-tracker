// Last updated: 7/27/2026, 11:41:50 AM
1class Solution {
2    public List<Integer> findDisappearedNumbers(int[] nums) {
3
4        List<Integer> ans = new ArrayList<>();
5
6        for (int i = 0; i < nums.length; i++) {
7
8            int index = Math.abs(nums[i]) - 1;
9
10            if (nums[index] > 0) {
11                nums[index] = -nums[index];
12            }
13        }
14
15        for (int i = 0; i < nums.length; i++) {
16
17            if (nums[i] > 0) {
18                ans.add(i + 1);
19            }
20        }
21
22        return ans;
23    }
24}