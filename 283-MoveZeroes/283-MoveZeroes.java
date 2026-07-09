// Last updated: 7/9/2026, 9:13:12 AM
class Solution {
    public void moveZeroes(int[] arr) {
        int n=arr.length;
        int arrs[]=new int[n];
        int c=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0)
            arrs[c++]=arr[i];
        }
        for(int i=0;i<n;i++){
            arr[i]=arrs[i];
        }
    }
}