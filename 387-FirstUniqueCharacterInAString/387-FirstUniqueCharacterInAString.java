// Last updated: 7/9/2026, 9:12:58 AM
class Solution {
    public int firstUniqChar(String s) {
        int[] freq = new int[26]; // For all lowercase letters
        // Count frequencies
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }
        // Find first unique character
        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }
}
