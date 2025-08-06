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
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> resultList = new ArrayList<>();
        postorder(root, resultList);
        return resultList;
    }

    private void postorder(TreeNode node, List<Integer> resultList) {
        if(node == null) {
            return;
        }

        postorder(node.left, resultList);
        postorder(node.right, resultList);
        resultList.add(node.val);
    }
}