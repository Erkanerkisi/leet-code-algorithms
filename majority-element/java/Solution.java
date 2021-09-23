class Solution {
    /*
     * With the assumption that majority element always exists.
     * Majority element needs to occur more than n / 2 times.
     */
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> countMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (countMap.containsKey(nums[i])) {
                int x = countMap.get(nums[i]);
                countMap.replace(nums[i], x + 1);
                if (countMap.get(nums[i]) > nums.length / 2) {  // Checking to see if nums[i] is the majority element
                    return nums[i];
                }
            }
            else {
                countMap.put(nums[i], 1);
            }
        }
        return nums[0]; // Since there always needs to be a majority element, array is a singleton.
    }
}
