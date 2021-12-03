class Solution {
    public int[] findBuildings(int[] heights) {
        int max = 0;
        Deque<Integer> list = new ArrayDeque();
        for (int i = heights.length - 1; i >= 0; i--) {
            if (heights[i] > max) {
                list.addFirst(i);
            }
            max = Math.max(heights[i], max);
        }
        return list.stream().mapToInt(i->i).toArray();
    }
}
