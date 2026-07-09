// Last updated: 7/9/2026, 9:11:55 AM
// 1332. Remove Palindromic Subsequences
// LeetCode signature: int removePalindromeSub(String s)
class Solution {
    public int removePalindromeSub(String s) {
        if (s == null || s.length() == 0) return 0;
        if (isPalindrome(s)) return 1;
        return 2;
    }
    private boolean isPalindrome(String s) {
        int i = 0, j = s.length()-1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) return false;
            i++; j--;
        }
        return true;
    }
}