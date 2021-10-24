class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))){
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            }
            else {
                map.put(s.charAt(i), 1);
            }
        }
        // I had to look up how the Comparator interface is used with PriorityQueue.
        Queue<Map.Entry<Character, Integer>> queue = new PriorityQueue<>(Comparator.<Map.Entry<Character, Integer>>comparingInt(Map.Entry::getValue));
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            // Inserting into a min heap = O(log(N))
            queue.add(entry);
        }
        StringBuilder builder = new StringBuilder();
        while (!queue.isEmpty()) {
            Map.Entry<Character, Integer> entry = queue.poll();
            while (entry.getValue() > 0) {
                builder.append(entry.getKey());
                entry.setValue(entry.getValue() - 1);
            }
        }
        return builder.reverse().toString();
    }
}
