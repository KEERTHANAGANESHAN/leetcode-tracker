// Last updated: 7/31/2026, 2:45:43 PM
1class Solution {
2    public int minimumPushes(String word) {
3        int[] freq = new int[26];
4        for (char c : word.toCharArray()) 
5            freq[c - 'a']++;
6        Arrays.sort(freq);
7        int ans = 0;
8        for (int i = 25; i >= 0 && freq[i] > 0; i--) 
9            ans += freq[i] * ((25 - i) / 8 + 1);
10        
11        return ans;
12    }
13}