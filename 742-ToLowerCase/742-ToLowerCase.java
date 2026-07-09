// Last updated: 7/9/2026, 9:12:24 AM
class Solution {
    public String toLowerCase(String S) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < S.length(); i++) {
            char ch = S.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
               ch= (char) (ch+ 32);

            }
            result.append(ch);
        }

        return result.toString();
            
    }
}
