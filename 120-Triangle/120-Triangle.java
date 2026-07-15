// Last updated: 7/15/2026, 10:07:55 AM
1class Solution {
2    public int minimumTotal(List<List<Integer>> triangle) {
3
4        for (int i = triangle.size() - 2; i >= 0; i--) {
5
6            for (int j = 0; j <= i; j++) {
7
8                int down = triangle.get(i + 1).get(j);
9                int diagonal = triangle.get(i + 1).get(j + 1);
10
11                triangle.get(i).set(j,
12                        triangle.get(i).get(j) + Math.min(down, diagonal));
13            }
14        }
15
16        return triangle.get(0).get(0);
17    }
18}