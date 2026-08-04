// Last updated: 8/4/2026, 2:38:29 PM
1class Solution {
2    private int gcd(int a, int b) {
3        while (b != 0) {
4            int temp = b;
5            b = a % b;
6            a = temp;
7        }
8        return a;
9    }
10    public int findGCD(int[] nums) {
11        int min = nums[0];
12        int max = nums[0];
13        for (int num : nums) {
14            min = Math.min(min, num);
15            max = Math.max(max, num);
16        }
17        return gcd(min, max);
18    }
19}
20
21