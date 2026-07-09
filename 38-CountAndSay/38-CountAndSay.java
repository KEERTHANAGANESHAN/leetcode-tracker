// Last updated: 7/9/2026, 9:28:16 AM
class Solution {
    public String countAndSay(int n) {
        if (n == 1) return "1";

        String result = "1";

        for (int k = 2; k <= n; k++) {
            StringBuilder sb = new StringBuilder();
            int i = 0;
            while (i < result.length()) {
                int count = 1;
                // Count the number of identical chars
                while (i + 1 < result.length() && result.charAt(i) == result.charAt(i + 1)) {
                    count++;
                    i++;
                }
                // Append count and character
                sb.append(count).append(result.charAt(i));
                i++;
            }
            result = sb.toString();
        }

        return result;
    }
}
