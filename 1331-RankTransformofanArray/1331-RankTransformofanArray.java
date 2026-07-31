// Last updated: 7/31/2026, 2:59:44 PM
1class Solution {
2    public int[] arrayRankTransform(int[] arr) {
3     int sorted[]=arr.clone();
4     Arrays.sort(sorted);
5     int m=0;
6     for(int x:sorted){
7        if(m==0||sorted[m-1]!=x){
8            sorted[m++]=x;
9        }
10     }   
11     int []unique=Arrays.copyOf(sorted,m);
12     for(int i=0;i<arr.length;i++){
13        arr[i]=Arrays.binarySearch(unique,arr[i])+1;
14     }
15     return arr;
16    }
17}
18