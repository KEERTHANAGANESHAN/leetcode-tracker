// Last updated: 7/22/2026, 2:46:07 PM
1class Solution {
2    public int maxScore(int[] cardPoints, int k) {
3        int s=0;
4        for(int n:cardPoints){
5            s+=n;
6        }
7        int t=cardPoints.length-k;
8        if(t==0) return s;
9        int l=Integer.MAX_VALUE;
10        for(int i=0;i<=cardPoints.length-t;i++){
11            int c=0;
12            for(int j=i;j<i+t;j++){
13                c+=cardPoints[j];
14            }
15            l=Math.min(l,c);
16        }
17         return s-l;
18    }
19}