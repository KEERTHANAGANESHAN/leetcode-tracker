// Last updated: 7/30/2026, 2:10:20 PM
1class Solution {
2    public String largestNumber(int[] nums) {
3        String[] arr = new String[nums.length];
4        for (int i = 0; i < nums.length; i++) {
5            arr[i] = String.valueOf(nums[i]);
6        }
7        Arrays.sort(arr, (a, b) -> (b + a).compareTo(a + b));
8        if (arr[0].equals("0")) return "0";
9        StringBuilder sb = new StringBuilder();
10        for (String s : arr) sb.append(s);
11        return sb.toString();
12    }
13}