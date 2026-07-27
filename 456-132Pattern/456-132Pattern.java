// Last updated: 7/27/2026, 2:55:11 PM
1class Solution {
2    public boolean find132pattern(int[] nums) {
3        Stack<Integer> stack = new Stack<>();
4        int second = Integer.MIN_VALUE;
5        for (int i = nums.length - 1; i >= 0; i--) {
6            if (nums[i] < second) {
7                return true;
8            }
9            while (!stack.isEmpty() && nums[i] > stack.peek()) {
10                second = stack.pop();
11            }
12            stack.push(nums[i]);
13        }
14        return false;
15    }
16}
17