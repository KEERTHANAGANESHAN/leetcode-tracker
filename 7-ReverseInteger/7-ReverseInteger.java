// Last updated: 7/9/2026, 9:28:39 AM
class Solution {
    public int reverse(int x) {
        long rev = 0;
        while (x != 0) {
            int digit = x % 10;
            rev = rev * 10 + digit;
            if (rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE) return 0;
            x /= 10;
        }
        return (int) rev;
    }
}