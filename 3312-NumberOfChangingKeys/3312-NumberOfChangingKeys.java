// Last updated: 7/9/2026, 9:11:18 AM
// 3019. Number of Changing Keys
// LeetCode signature: int countKeyChanges(String s)
class Solution {
    public int countKeyChanges(String s) {
        if (s == null || s.length() <= 1) return 0;
        int changes = 0;
        for (int i = 1; i < s.length(); i++) {
            if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(i-1))) {
                changes++;
            }
        }
        return changes;
    }
}