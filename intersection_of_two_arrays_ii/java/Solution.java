class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums1.length; i++) {
            if (map.containsKey(nums1[i])) {
                map.put(nums1[i], map.get(nums1[i]) + 1);
            }
            else {
                map.put(nums1[i], 1);
            }
        }
        // Used LinkedList here because of O(1) insertion complexity, but the difference between ArrayList is not that much (4 ms).
        List<Integer> list = new LinkedList<>();
        for (int j = 0; j < nums2.length; j++) {
            if (map.containsKey(nums2[j]) && map.get(nums2[j]) > 0) {
                list.add(nums2[j]);
                map.put(nums2[j], map.get(nums2[j]) - 1);
            }
        }
        return list.stream().mapToInt(i -> i).toArray();
    }
}
