// Last updated: 8/4/2026, 1:54:26 PM
1class Solution {
2    public List<Integer> findMissingElements(int[] nums) {
3        List<Integer> res = new ArrayList<>();
4        Arrays.sort(nums);
5        int currEle = nums[0];
6        for(int i = 0 ; i < nums.length ; currEle++, i++){
7            if(currEle < nums[i]){
8                res.add(currEle);
9                i--;
10            }
11        }
12        return res;
13    }
14}