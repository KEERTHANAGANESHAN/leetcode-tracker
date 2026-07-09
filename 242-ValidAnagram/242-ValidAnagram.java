// Last updated: 7/9/2026, 9:13:18 AM
class Solution {
    public boolean isAnagram(String s, String t) {
        char a[]=s.toLowerCase().toCharArray();
        char b[]=t.toLowerCase().toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        return(Arrays.equals(a,b));
    }
}