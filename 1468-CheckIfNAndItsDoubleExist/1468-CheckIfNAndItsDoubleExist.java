// Last updated: 7/9/2026, 9:12:07 AM
class Solution {
    public boolean checkIfExist(int[] arr) {
    Set<Integer> set = new HashSet<>();
    for (int num : arr) {
        if (set.contains(2 * num) || (num % 2 == 0 && set.contains(num / 2))) {
            return true;
        }
        set.add(num);
    }
    return false;
}
}
