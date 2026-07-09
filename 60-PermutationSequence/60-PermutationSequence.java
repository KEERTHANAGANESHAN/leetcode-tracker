// Last updated: 7/9/2026, 9:27:56 AM
class Solution {
    public String getPermutation(int n, int k) {
        // Step 1: Precompute factorials
        int[] fact = new int[n + 1];
        fact[0] = 1;
        for (int i = 1; i <= n; i++) {
            fact[i] = fact[i - 1] * i;
        }
        
        // Step 2: Create list of numbers [1..n]
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            numbers.add(i);
        }
        
        // Step 3: Build result
        StringBuilder sb = new StringBuilder();
        k--; // convert to 0-indexed
        
        for (int i = n; i >= 1; i--) {
            int index = k / fact[i - 1];
            sb.append(numbers.get(index));
            numbers.remove(index);
            k %= fact[i - 1];
        }
        
        return sb.toString();
    }
}