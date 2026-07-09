// Last updated: 7/9/2026, 9:27:45 AM
class Solution {
    public boolean isThere(int[] arr,int k) {
        int low=0;
        int high = arr.length - 1;
        while(low<=high){
            int mid =low + (high - low)/2;
            if(arr[mid] == k) return true;
            if(arr[mid] < k){
                low=mid+1;
            }
            else{
                high=mid -1;
            }
        }
        return false;
}
 public boolean searchMatrix(int[][] arr, int k) {
            int m= arr.length;
            for(int i=0;i<m;i++){
                if(isThere(arr[i],k))
                return true;
            } 
            return false;
    }
}
