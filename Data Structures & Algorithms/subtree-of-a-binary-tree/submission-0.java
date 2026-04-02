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
     public boolean isSameTree(TreeNode p, TreeNode q) {
        Stack<TreeNode> stk1= new Stack<>();
        Stack<TreeNode> stk2= new Stack<>();
        stk1.push(p);
        stk2.push(q);
        while(!stk1.isEmpty() && !stk2.isEmpty()){
            TreeNode node1=stk1.pop();
            TreeNode node2=stk2.pop();
            
            if (node1 == null && node2 == null) continue;
            if (node1 == null || node2 == null || node1.val != node2.val) {
                return false;
            }
            
            stk1.push(node1.left);
            stk1.push(node1.right);
            stk2.push(node2.left);
            stk2.push(node2.right);
        }
        

        return stk1.isEmpty() && stk2.isEmpty();
    }

    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root==null && subRoot==null) return true;

        if(root!=null && subRoot==null) return true;

        if(root==null && subRoot!=null) return false;

        Stack<TreeNode> stk1= new Stack<>();
        stk1.push(root);
        while(!stk1.isEmpty()){
            TreeNode node=stk1.pop();
            if(isSameTree(node,subRoot)) return true;
            if(node.left!=null) stk1.push(node.left);
            if(node.right!=null) stk1.push(node.right);
    }
    return false;
}
}

