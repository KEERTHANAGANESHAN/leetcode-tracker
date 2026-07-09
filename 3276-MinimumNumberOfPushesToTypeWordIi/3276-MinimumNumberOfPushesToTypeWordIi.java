// Last updated: 7/9/2026, 9:11:22 AM
import java.util.*;

class Solution {
    public int minimumPushes(String word) {
        int[] freq = new int[26];
        for (char c : word.toCharArray()) freq[c - 'a']++;

        Arrays.sort(freq);
        int pushes = 0, idx = 0;
        for (int i = 25; i >= 0; i--) {
            if (freq[i] == 0) break;
            pushes += (idx / 8 + 1) * freq[i]; // cost grows every 8 letters
            idx++;
        }
        return pushes;
    }
}