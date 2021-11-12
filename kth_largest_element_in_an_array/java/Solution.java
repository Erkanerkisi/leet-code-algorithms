class Solution {
    // This solution has O(N * log(N) + k) time complexity, and O(N) space complexity
    /*
    public int findKthLargest(int[] nums, int k) {
        Queue<Integer> heap = new PriorityQueue<>(Collections.reverseOrder());  // Max heap
        for (int i = 0; i < nums.length; i++) {
            heap.add(nums[i]);  // Insertion to max heap is O(log(N))
        }
        while (k > 1) {
            heap.poll();
            k--;
        }
        return heap.peek();
    }
    */
    
    // This solution has O(N * log(N)) time complexity, and O(1) space complexity
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length - k];
    }
}
