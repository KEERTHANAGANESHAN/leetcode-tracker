// Last updated: 7/9/2026, 9:12:12 AM
class Solution {
    public int[] sortArrayByParity(int[] nums) {
       
    int[] res = new int[nums.length];
    int i = 0, j = nums.length - 1;
    for (int n : nums) {
        if (n % 2 == 0) res[i++] = n;
        else res[j--] = n;
    }
    return res;
        
    }
}