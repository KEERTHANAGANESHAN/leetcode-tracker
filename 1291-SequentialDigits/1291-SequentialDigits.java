// Last updated: 8/4/2026, 2:04:27 PM
1class Solution {
2    public int gcdOfOddEvenSums(int n) {
3        return gcd(n*(n+1),n*n);
4    }
5    public static int gcd(int a,int b){
6        if(b==0)return a;
7        return gcd(b,a%b);
8    }
9}