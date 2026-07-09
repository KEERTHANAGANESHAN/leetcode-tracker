// Last updated: 7/9/2026, 9:11:44 AM
 // 2027. Minimum Moves to Convert String
// LeetCode signature: int minimumMoves(String s)
class Solution {
    public int minimumMoves(String s) {
        int n = s.length(), moves = 0;
        for (int i = 0; i < n; ) {
            if (s.charAt(i) == 'X') {
                moves++;
                i += 3; // convert i, i+1, i+2 to 'O'
            } else i++;
        }
        return moves;
    }
}