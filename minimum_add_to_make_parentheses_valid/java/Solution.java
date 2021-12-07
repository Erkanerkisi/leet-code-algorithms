class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> stack = new Stack();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(s.charAt(i));
            }
            else {
                if (stack.isEmpty() || stack.peek() == ')') {
                    stack.push(s.charAt(i));
                }
                else {
                    stack.pop();
                }
            }
        }
        return stack.size();
    }
}
