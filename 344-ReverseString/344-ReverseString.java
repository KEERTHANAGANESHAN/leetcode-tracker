// Last updated: 7/9/2026, 9:13:04 AM
// Reverse String (in-place)
class Solution {
    public void reverseString(char[] s) {
        int i = 0, j = s.length - 1;
        while (i < j) {
            char tmp = s[i];
            s[i] = s[j];
            s[j] = tmp;
            i++; j--;
        }
    }
}