/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
/*  This is the first solution which uses levels LinkedList to hold ALL nodes on the same level. This can be optimized.
class Solution {
    List<Integer> list = new ArrayList();
    public List<Integer> rightSideView(TreeNode root) {
        if (root == null) {
            return list;
        }
        Queue<TreeNode> queue = new LinkedList();
        queue.add(root);
        while (!queue.isEmpty()) {
            Deque<Integer> level = new LinkedList();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode curr = queue.poll();
                level.addFirst(curr.val);
                if (curr.left != null) {
                    queue.add(curr.left);
                }
                if (curr.right != null) {
                    queue.add(curr.right);
                }
            }
            list.add(level.getFirst());
        }
        return list;
    }
}
*/
//  This does not use a levels list, instead gets the rightmost node through iteration directly.
class Solution {
    List<Integer> list = new ArrayList();
    public List<Integer> rightSideView(TreeNode root) {
        if (root == null) {
            return list;
        }
        Queue<TreeNode> queue = new LinkedList();
        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode curr = queue.poll();
                if (i == size - 1) {
                    list.add(curr.val);
                }
                if (curr.left != null) {
                    queue.add(curr.left);
                }
                if (curr.right != null) {
                    queue.add(curr.right);
                }
            }
        }
        return list;
    }
}
