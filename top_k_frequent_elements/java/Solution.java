class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        Queue<Map.Entry<Integer, Integer>> queue = new PriorityQueue(Comparator.<Map.Entry<Integer, Integer>>comparingInt(Map.Entry::getValue).reversed());
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            queue.offer(entry);
        }
        List<Integer> returnList = new ArrayList();
        while (k-- > 0) {
            returnList.add(queue.poll().getKey());
        }
        return returnList.stream().mapToInt(Integer::intValue).toArray();
    }
}
