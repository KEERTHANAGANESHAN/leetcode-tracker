// Last updated: 7/9/2026, 9:28:42 AM
class Solution {
    public String longestPalindrome(String s) {
       int n=s.length();
       String l="";
       for(int i=0;i<n;i++){
        for(int j=i+1;j<=n;j++){
            String str=s.substring(i,j);
            if(p(str)){
                if(l.length()<str.length()){
                        l=str;
                }
            }
        }
       }
       return l;
    }
    public boolean p(String s){
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}