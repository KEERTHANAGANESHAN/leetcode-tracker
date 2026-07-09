// Last updated: 7/9/2026, 9:11:54 AM
class Solution {
    public int minSteps(String s, String t) {
        int[] count = new int[26];
        
    
        for (char c : s.toCharArray()) count[c - 'a']++;
        for (char c : t.toCharArray()) count[c - 'a']--;
        
        int steps = 0;
        for (int val : count) {
            if (val > 0) steps += val;
        }
        return steps;
    }
}