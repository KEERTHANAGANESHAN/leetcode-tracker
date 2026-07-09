// Last updated: 7/9/2026, 9:28:04 AM
class Solution {
    public List<Integer> spiralOrder(int[][] arr) {
        List<Integer> ll=new ArrayList<>();
        int row=arr.length;
        int col=arr[0].length;
        int top=0;
        int bot=row-1;
        int right=col-1;
        int left=0;
        int c=0;
        int t=row*col;
        while(c<t){
        for(int j=left;j<=right &&c<t ;j++){
            ll.add(arr[top][j]);
            c++;
        }  
        top++;
        for(int i=top;i<=bot &&c<t ;i++){
            ll.add(arr[i][right]);
            c++;
        }  
        right--;
        for(int j=right;j>=left &&c<t ;j--){
            ll.add(arr[bot][j]);
            c++;
        }  
        bot--;
        for(int i=bot;i>=top &&c<t ;i--){
            ll.add(arr[i][left]);
            c++;
        }  
        left++;
        }
       return ll;
    }
}