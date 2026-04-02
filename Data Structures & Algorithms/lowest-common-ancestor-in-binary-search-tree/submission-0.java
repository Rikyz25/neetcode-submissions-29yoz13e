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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null) return null;
        TreeNode node=root;
        if(node.val == p.val ||  node.val == q.val){
            return node;
        }
        TreeNode leftLCA= lowestCommonAncestor(node.left, p, q);
        TreeNode rightLCA= lowestCommonAncestor(node.right, p, q);

        if(leftLCA!=null && rightLCA!=null){
            return node;
        }
        else if (leftLCA!=null){
            return leftLCA;
        }
        else return rightLCA;
    }
}
