// Last updated: 7/9/2026, 9:13:15 AM
class Solution {
    public boolean isUgly(int n) {
        if (n <= 0) return false;
        for (int p : new int[]{2, 3, 5}) {
            while (n % p == 0) {
                n /= p;
            }
        }
        return n == 1;
    }
}