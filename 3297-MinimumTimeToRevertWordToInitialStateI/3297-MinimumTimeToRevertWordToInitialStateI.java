// Last updated: 7/9/2026, 9:11:16 AM
class Solution {
    public int minimumTimeToInitialState(String word, int k) {
        int n = word.length();
        for (int t = 1; t * k < n; t++) {
            if (word.startsWith(word.substring(t * k))) return t;
        }
        return (n + k - 1) / k; // ceil(n/k)
    }
}