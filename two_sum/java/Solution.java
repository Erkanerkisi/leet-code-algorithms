class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] twoSum = new int[2];
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i],i);
        }
        for (int j = 0; j < nums.length; j++) {
            if (map.containsKey(target - nums[j]) && map.get(target - nums[j]) != j) {  // Look for the difference, and if the indexes are different, we are done.
                twoSum[0] = map.get(target - nums[j]);
                twoSum[1] = j;
            }
        }
        return twoSum;
    }
}
