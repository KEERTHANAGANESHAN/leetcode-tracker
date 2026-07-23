// Last updated: 7/23/2026, 2:57:20 PM
1class Solution {
2    public int minOperations(int[] nums, int x) {
3
4        int total = 0;
5        for (int num : nums) {
6            total += num;
7        }
8
9        int target = total - x;
10
11        if (target < 0)
12            return -1;
13
14        if (target == 0)
15            return nums.length;
16
17        int left = 0;
18        int sum = 0;
19        int maxLen = -1;
20
21        for (int right = 0; right < nums.length; right++) {
22
23            sum += nums[right];
24
25            while (sum > target) {
26                sum -= nums[left];
27                left++;
28            }
29
30            if (sum == target) {
31                maxLen = Math.max(maxLen, right - left + 1);
32            }
33        }
34
35        if (maxLen == -1)
36            return -1;
37
38        return nums.length - maxLen;
39    }
40}