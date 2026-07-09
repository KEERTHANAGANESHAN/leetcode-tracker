// Last updated: 7/9/2026, 9:28:38 AM
class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int ori=x;
        int r=0;
        while(x>0){
            int d=x%10;
            r=r*10+d;
            x/=10;
        }
        return r==ori;
    }
}