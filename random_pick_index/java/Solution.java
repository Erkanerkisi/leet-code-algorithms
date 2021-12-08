class Solution {
    private Map<Integer, List<Integer>> map;

    public Solution(int[] nums) {
        map = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                List<Integer> indexes = map.get(nums[i]);
                indexes.add(i);
                map.put(nums[i], indexes);
            }
            else {
                List<Integer> indexes = new ArrayList();
                indexes.add(i);
                map.put(nums[i], indexes);
            }
        }
    }
    
    public int pick(int target) {
        return map.get(target).get((int)(Math.random() * map.get(target).size()));
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int param_1 = obj.pick(target);
 */
