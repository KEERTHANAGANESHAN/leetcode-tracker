// Last updated: 7/9/2026, 9:28:33 AM
import java.util.*;

class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> val = new HashMap<>();
        val.put('I', 1);
        val.put('V', 5);
        val.put('X', 10);
        val.put('L', 50);
        val.put('C', 100);
        val.put('D', 500);
        val.put('M', 1000);

        int total = 0;
        for (int i = 0; i < s.length(); i++) {
            int curr = val.get(s.charAt(i));
            if (i + 1 < s.length()) {
                int next = val.get(s.charAt(i + 1));
                if (curr < next) {
                    total -= curr;
                } else {
                    total += curr;
                }
            } else {
                total += curr;
            }
        }
        return total;
    }
}