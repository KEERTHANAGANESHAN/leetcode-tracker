// Last updated: 7/28/2026, 11:59:49 AM
1class Solution {
2
3    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
4        int original = image[sr][sc];
5        if (original == color) {
6            return image;
7        }
8        dfs(image, sr, sc, original, color);
9        return image;
10    }
11    public void dfs(int[][] image, int r, int c, int original, int color) {
12        if (r < 0 || c < 0 || r >= image.length || c >= image[0].length) {
13            return;
14        }
15        if (image[r][c] != original) {
16            return;
17        }
18        image[r][c] = color;
19        dfs(image, r - 1, c, original, color); 
20        dfs(image, r + 1, c, original, color); 
21        dfs(image, r, c - 1, original, color); 
22        dfs(image, r, c + 1, original, color); 
23    }
24}