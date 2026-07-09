// Last updated: 7/9/2026, 9:27:16 AM
class Solution {
    public int candy(int[] ratings) {
        int n=ratings.length;
        int c[]=new int[n];
        for(int i=0;i<n;i++){
            c[i]=1;
        }
        for(int i=1;i<n;i++){
            if(ratings[i]>ratings[i-1]){
                c[i]=c[i-1]+1;
            }
        }
        for(int i=n-2;i>=0;i--){
            if(ratings[i]>ratings[i+1]){
                c[i]=Math.max(c[i],c[i+1]+1);
            }
        }
        int t=0;
        for(int s:c){
            t+=s;
        }
        return t;
    }
}