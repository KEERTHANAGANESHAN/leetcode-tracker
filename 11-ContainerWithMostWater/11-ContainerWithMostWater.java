// Last updated: 7/9/2026, 9:28:36 AM
class Solution {
    public int maxArea(int[] height) {
     int n=height.length;
     int l=0;
     int r=n-1;
     int m=0;
     while(l<r){
        int w=r-l;
        int h=Math.min(height[l],height[r]);
        int a=w*h;
        m=Math.max(a,m);
        if(height[l]<height[r]){
           l++;
        }
        else{
            r--;
        }
     } 
     return m;  
    }
}