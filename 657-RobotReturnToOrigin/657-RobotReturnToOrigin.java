// Last updated: 7/9/2026, 9:12:28 AM
 // Robot Return to Origin
class Solution {
    public boolean judgeCircle(String moves) {
        int x = 0, y = 0;
        for (char c : moves.toCharArray()) {
            if (c == 'U') y++;
            else if (c == 'D') y--;
            else if (c == 'L') x--;
            else if (c == 'R') x++;
        }
        return x == 0 && y == 0;
    }
}