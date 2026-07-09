// Last updated: 7/9/2026, 9:12:34 AM
class Solution {
    public int distributeCandies(int[] candyType) {
        Arrays.sort(candyType);
        int uniqueTypes = 1; 
        for (int i = 1; i < candyType.length; i++) {
            if (candyType[i] != candyType[i - 1]) {
                uniqueTypes++;
            }
        }
        int maxAllowed = candyType.length / 2;
        return Math.min(uniqueTypes, maxAllowed);
    }
}