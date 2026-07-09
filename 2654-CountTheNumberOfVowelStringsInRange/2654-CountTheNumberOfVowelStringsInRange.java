// Last updated: 7/9/2026, 9:11:37 AM
 // 2586. Count the Number of Vowel Strings in Range
// LeetCode signature: int vowelStrings(String[] words, int left, int right)
class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        int cnt = 0;
        for (int i = left; i <= right; i++) {
            String w = words[i];
            if (!w.isEmpty() && isVowel(w.charAt(0)) && isVowel(w.charAt(w.length()-1))) cnt++;
        }
        return cnt;
    }
    private boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return c=='a' || c=='e' || c=='i' || c=='o' || c=='u';
    }
}