class Solution {
    public static void main(String[] args) {
        int[] arr = new int[]{5, 3, 0, 0};
        System.out.println(canJump(arr));
    }

    public static boolean canJump(int[] nums) {
        int lastIdx = nums.length - 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (i + nums[i] >= lastIdx) {
                lastIdx = i;
            }
        }
        return lastIdx == 0;
    }
}