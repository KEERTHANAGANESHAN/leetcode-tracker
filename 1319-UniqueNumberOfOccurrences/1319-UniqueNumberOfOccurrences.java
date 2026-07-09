// Last updated: 7/9/2026, 9:11:58 AM
class Solution {
   public boolean uniqueOccurrences(int[] arr) {
    Map<Integer, Integer> freq = new HashMap<>();
    for (int num : arr) {
        freq.put(num, freq.getOrDefault(num, 0) + 1);
    }

    Set<Integer> occurrences = new HashSet<>(freq.values());
    return occurrences.size() == freq.size();
}

}