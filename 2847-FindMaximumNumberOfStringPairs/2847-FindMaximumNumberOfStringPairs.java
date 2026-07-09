// Last updated: 7/9/2026, 9:11:33 AM
// 2744. Find Maximum Number of String Pairs
// LeetCode signature: int maximumNumberOfStringPairs(String[] words)
import java.util.*;
class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        Set<String> seen = new HashSet<>();
        int pairs = 0;
        for (String w : words) {
            String rev = new StringBuilder(w).reverse().toString();
            if (seen.contains(rev)) {
                pairs++;
                seen.remove(rev); // both consumed
            } else {
                seen.add(w);
            }
        }
        return pairs;
    }
}