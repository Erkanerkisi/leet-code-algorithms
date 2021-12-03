class Solution {
    public boolean isMonotonic(int[] nums) {
        if (nums.length < 3) {
            return true;
        }
        Boolean status = null;
        for (int i = 0; i < nums.length - 1; i++) {
            if (status == null) {
                if (nums[i + 1] - nums[i] > 0) {
                    status = true;
                }
                else if (nums[i + 1] - nums[i] < 0) {
                    status = false;
                }
            }
            else {
                if (status.booleanValue() && nums[i + 1] - nums[i] < 0) {
                    return false;
                }
                else if (!status.booleanValue() && nums[i + 1] - nums[i] > 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
