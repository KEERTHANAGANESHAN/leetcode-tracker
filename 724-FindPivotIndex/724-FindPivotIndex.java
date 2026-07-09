// Last updated: 7/9/2026, 9:12:26 AM
class Solution {
    public int pivotIndex(int[] nums) {
      
    int total = Arrays.stream(nums).sum(), leftSum = 0;
    for (int i = 0; i < nums.length; i++) {
        if (leftSum == total - leftSum - nums[i]) return i;
        leftSum += nums[i];
    }
    return -1;
        
    }
}