// Last updated: 7/9/2026, 9:27:10 AM
class Solution {
    public int singleNumber(int[] nums) {
    int result = 0;
    for (int num : nums) {
        result ^= num;
    }
    return result;
}

}