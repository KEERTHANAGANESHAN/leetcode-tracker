// Last updated: 7/9/2026, 9:13:29 AM
class Solution {
    public boolean containsDuplicate(int[] nums) {
    Set<Integer> seen = new HashSet<>();
    for (int num : nums) {
        if (!seen.add(num)) return true;
    }
    return false;
}

}