// Last updated: 7/9/2026, 9:12:06 AM
class Solution {
    public int fib(int n) {
        int a=0;
        int b=1;
        for(int i=0;i<n;i++){
            int c=a+b;
            a=b;
            b=c;
        }
        return a;
    }
}