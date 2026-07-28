// Last updated: 7/28/2026, 2:47:42 PM
1class Solution {
2    public String triangleType(int[] nums) {
3        int a = nums[0];
4        int b = nums[1];
5        int c = nums[2];
6        if (a + b <= c || a + c <= b || b + c <= a) {
7            return "none";
8        }
9        if (a == b && b == c) {
10            return "equilateral";
11        }
12        if (a == b || b == c || a == c) {
13            return "isosceles";
14        }
15        return "scalene";
16    }
17}