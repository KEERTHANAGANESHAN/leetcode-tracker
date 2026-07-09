// Last updated: 7/9/2026, 9:27:37 AM
class Solution {
   public void merge(int[] nums1, int m, int[] nums2, int n) {
    int res[]=new int[m+n];
    for(int i=0;i<m;i++){
        res[i]=nums1[i];
    }
     for(int j=0;j<n;j++){
        res[m+j]=nums2[j];
    }
    Arrays.sort(res);
    for(int i=0;i<m+n;i++){
        nums1[i]=res[i];
    }
}

}