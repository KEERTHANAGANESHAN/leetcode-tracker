// Last updated: 7/9/2026, 9:11:20 AM
class Solution {
    public boolean checkPrimeFrequency(int[] nums) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        for (int freq : freqMap.values()) {
            if (isPrime(freq)) {
                return true;
            }
        }

        return false;
    }
    private boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n == 2 || n == 3) return true;
        if (n % 2 == 0) return false;

        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }
}