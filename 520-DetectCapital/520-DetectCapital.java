// Last updated: 7/9/2026, 9:12:36 AM
class Solution {
    public boolean detectCapitalUse(String s) {
        int m=0;
        int r=0;
        int n=0;
        char a[]=s.toCharArray();
        if(a[0]>=65 && a[0]<=90){
            m++;
        }
        for(int i=0;i<a.length;i++){
            if(a[i]>=65 && a[i]<=90){
              n++;
            }
            if(a[i]>=97 && a[i]<=122){
                r++;
            }
        }
        if(r==s.length() ||n==s.length() ||(m==1 && n==1)){
            return true;
        }
        return false;
    }
}