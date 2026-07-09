// Last updated: 7/9/2026, 9:11:25 AM
class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
       
        double maxDiag = 0;
        int maxArea = 0;
        for (int[] dim : dimensions) {
            int l = dim[0], w = dim[1];
            double diag = Math.sqrt((long) l * l + (long) w * w);
            int area = l * w;
            if (diag > maxDiag || (diag == maxDiag && area > maxArea)) {
                maxDiag = diag;
                maxArea = area;
            }
        }
        return maxArea;
    }
}

    