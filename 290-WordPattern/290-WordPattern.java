// Last updated: 7/9/2026, 9:13:09 AM
class Solution {
    public boolean wordPattern(String pattern, String s) {

        String[] words = s.split(" ");

        if (pattern.length() != words.length)
            return false;

        for (int i = 0; i < pattern.length(); i++) {

            for (int j = 0; j < i; j++) {

                boolean sameChar = pattern.charAt(i) == pattern.charAt(j);
                boolean sameWord = words[i].equals(words[j]);

                if (sameChar != sameWord)
                    return false;
            }
        }

        return true;
    }
}