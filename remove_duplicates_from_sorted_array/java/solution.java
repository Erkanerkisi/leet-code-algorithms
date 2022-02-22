public class Solution {
    public int removeDuplicates(int[] nums) {

        if (nums.length == 0) {
            return 0;
        }

        int lastItem = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[lastItem]) {
                lastItem++;
                nums[lastItem] = nums[i];
            }
        }
        return lastItem + 1;
    }
}
