// Last updated: 7/9/2026, 9:11:36 AM

// 2609. Find the Longest Balanced Substring of a Binary String
// LeetCode signature: int findTheLongestBalancedSubstring(String s)
class Solution {
    public int findTheLongestBalancedSubstring(String s) {
        int n = s.length(), ans = 0;
        int i = 0;
        while (i < n) {
            // count zeros
            int zeros = 0;
            while (i < n && s.charAt(i) == '0') { zeros++; i++; }
            int j = i;
            int ones = 0;
            while (j < n && s.charAt(j) == '1') { ones++; j++; }
            ans = Math.max(ans, 2 * Math.min(zeros, ones));
            i = Math.max(i+1, j); // move forward (i is already at first '1' or end)
            // but safe to set i = j to continue from ones block end
            i = j;
        }
        return ans;
    }
}