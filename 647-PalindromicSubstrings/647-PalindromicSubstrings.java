// Last updated: 7/9/2026, 9:12:29 AM
class Solution {
    public int countSubstrings(String s) {
        int n = s.length();
        int count = 0;
        
        // Expand around center
        for (int i = 0; i < n; i++) {
            count += expand(s, i, i);     // Odd length
            count += expand(s, i, i + 1); // Even length
        }
        return count;
    }
    
    private int expand(String s, int left, int right) {
        int cnt = 0;
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            cnt++;
            left--;
            right++;
        }
        return cnt;
    }
}