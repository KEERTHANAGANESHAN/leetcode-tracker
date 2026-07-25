// Last updated: 7/25/2026, 11:39:09 AM
1class Solution {
2    public int lengthOfLongestSubstring(String s) {
3        int m=0;
4        for(int i=0;i<s.length();i++){
5            HashSet<Character> set=new HashSet<>();
6            for(int j=i;j<s.length();j++){
7            char ch=s.charAt(j);
8              if(set.contains(ch))
9                 break;
10            set.add(ch);
11            }
12            if(set.size()>m){
13                m=set.size();
14            }
15        }
16        return m;
17    }
18}