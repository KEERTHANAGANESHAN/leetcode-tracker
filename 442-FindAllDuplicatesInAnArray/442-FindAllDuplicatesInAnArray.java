// Last updated: 7/9/2026, 9:12:52 AM
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        List<Integer> result = new ArrayList<>();

        for (int num : nums) {
            if (seen.contains(num)) {
                result.add(num);  // Second occurrence
            } else {
                seen.add(num);    // First occurrence
            }
        }

        return result;
    }
}
