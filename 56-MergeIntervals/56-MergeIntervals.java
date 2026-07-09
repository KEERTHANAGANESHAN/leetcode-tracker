// Last updated: 7/9/2026, 9:28:01 AM
class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        List<int[]> ans=new ArrayList<>();
        int current[]=intervals[0];
        for(int i=0;i<intervals.length;i++){
            if(intervals[i][0]<=current[1]){
                current[1]=Math.max(intervals[i][1],current[1]);
            }
            else{
                ans.add(current);
                current=intervals[i];
            }
        }
        ans.add(current);
        return ans.toArray(new int[ans.size()][]);
    }
}