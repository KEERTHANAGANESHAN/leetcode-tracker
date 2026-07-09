// Last updated: 7/9/2026, 9:11:46 AM
class Solution {
    public boolean checkIfPangram(String sentence) {
      boolean visited[]=new boolean[26];
      for(int i=0;i<sentence.length();i++){
        char ch=sentence.charAt(i);
        visited[ch-'a']=true;
      }
      for(int i=0;i<26;i++){
        if(visited[i]==false)
            return false;
      }
      return true;
    }
}