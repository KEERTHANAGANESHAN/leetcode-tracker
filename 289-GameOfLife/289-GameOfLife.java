// Last updated: 7/9/2026, 9:13:11 AM
class Solution {
    public void gameOfLife(int[][] board) {
        int m = board.length, n = board[0].length;

        // Directions for 8 neighbors
        int[][] dirs = {{1,0},{-1,0},{0,1},{0,-1},{1,1},{1,-1},{-1,1},{-1,-1}};

        // Step 1: apply rules with temporary states
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int liveNeighbors = 0;

                for (int[] d : dirs) {
                    int r = i + d[0], c = j + d[1];
                    if (r >= 0 && r < m && c >= 0 && c < n && Math.abs(board[r][c]) == 1) {
                        liveNeighbors++;
                    }
                }

                // Rule 1 or 3: live cell dies
                if (board[i][j] == 1 && (liveNeighbors < 2 || liveNeighbors > 3)) {
                    board[i][j] = -1; // mark as dead but was alive
                }

                // Rule 4: dead cell becomes live
                if (board[i][j] == 0 && liveNeighbors == 3) {
                    board[i][j] = 2; // mark as alive but was dead
                }
            }
        }

        // Step 2: finalize updates
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] > 0) {
                    board[i][j] = 1; // alive
                } else {
                    board[i][j] = 0; // dead
                }
            }
        }
    }
}