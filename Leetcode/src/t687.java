/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {

    int res = 0;

    public int longestUnivaluePath(TreeNode root) {
        if (root == null)
            return 0;
        int num = travelPath(root.val, root.left) + travelPath(root.val, root.right);
        res = Math.max(res, num);
        return res;
    }

    public int travelPath(int val, TreeNode node) {
        if (node == null)
            return 0;

        int num = 0;
        int a = travelPath(node.val, node.left);
        int b = travelPath(node.val, node.right);
        if (node.val == val) {
            res = Math.max(res, Math.max(a, b) + 1);
            res = Math.max(res, a + b);
            return Math.max(a, b) + 1;
        } else {
            num = a + b;
            res = Math.max(res, num);
            return 0;
        }
    }

}