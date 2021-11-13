class Solution {
    public void rotate(int[] nums, int k) {
        int copyArr[] = new int[nums.length];
        k %= nums.length;
        for (int i = 0; i < k; i++) {
            copyArr[i] = nums[nums.length - k + i];
        }
        for (int i = k; i < nums.length; i++) {
            copyArr[i] = nums[i - k];
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = copyArr[i];   // Copying the items from the copy array.   
        }
    }
}
