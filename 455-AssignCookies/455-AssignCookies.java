// Last updated: 7/9/2026, 9:12:43 AM
import java.util.Arrays;

class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        
        int i = 0; // child pointer
        int j = 0; // cookie pointer
        
        while (i < g.length && j < s.length) {
            if (s[j] >= g[i]) {
                i++; // assign cookie to child
            }
            j++; // move to next cookie
        }
        
        return i; // number of content children
    }
}