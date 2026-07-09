// Last updated: 7/9/2026, 9:24:48 AM
class Solution {
    public int titleToNumber(String columnTitle) {
        
    int result = 0;
    for (char c : columnTitle.toCharArray()) {
        result = result * 26 + (c - 'A' + 1);
    }
    return result;
}
}
