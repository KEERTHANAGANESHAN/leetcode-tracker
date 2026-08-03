// Last updated: 8/3/2026, 2:28:49 PM
1class Solution {
2    public int findSubstringInWraproundString(String s){
3        int dp[] = new int[s.length()];
4        dp[s.length() - 1] = 1;
5        int maxArray[] = new int[26];
6        maxArray[s.charAt(s.length()-1) - 'a'] = 1;
7        for(int i = s.length() - 2 ; i >= 0 ; i--){
8            if(s.charAt(i) == s.charAt(i+1) - 1 || s.charAt(i) == 'z' && s.charAt(i+1) == 'a'){
9                dp[i] = 1 + dp[i+1];
10            }else{
11                dp[i] = 1;
12            }
13            int key = s.charAt(i) - 'a';
14            maxArray[key] = Math.max(maxArray[key],dp[i]);
15        }
16        int res = 0;
17        for(int i=0;i<26;i++){
18            res = res + maxArray[i];
19        }
20        return res;
21    }
22}