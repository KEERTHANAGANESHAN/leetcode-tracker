// Last updated: 7/9/2026, 9:27:46 AM
class Solution {
    public void setZeroes(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;

        Set<Integer> zeroRows =new HashSet<>();
        Set<Integer> zeroCols =new HashSet<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==0){
                zeroRows.add(i);
                zeroCols.add(j);
                }
            }
        }
        for(int r: zeroRows){
            for(int j=0;j<n;j++){
                matrix[r][j]=0;
            }
        }
         for(int c: zeroCols){
           for(int i=0;i<m;i++){
                matrix[i][c]=0;
            }
        }    
    }
}