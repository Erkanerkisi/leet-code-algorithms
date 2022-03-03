public class Solution {
    public int searchInsert(int[] nums, int target) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            if (target == nums[i]) {
                result = i;
            } else if (target < nums[0]) {
                result = 0;
            } else if (target > nums[nums.length - 1]) {
                result = nums.length;
            }
        }
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] < target && nums[i + 1] > target) {
                result = i + 1;
            }
        }
        return result;
    }
}