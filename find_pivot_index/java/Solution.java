class Solution {
    public int pivotIndex(int[] nums) {
        int sum = 0;
        Map<Integer, Integer> map = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            map.put(i, sum);
        }
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                if (map.get(nums.length - 1) - map.get(i) == 0) {
                    return i;
                }
            }
            else if (i == nums.length - 1) {
                if (map.get(i - 1) == 0) {
                    return i;
                }
            }
            else {
                if (map.get(i - 1) == (map.get(nums.length - 1) - map.get(i))) {
                    return i;
                }
            }
        }
        return -1;
    }
}
