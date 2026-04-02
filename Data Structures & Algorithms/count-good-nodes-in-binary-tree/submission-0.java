class Solution {
    public int goodNodes(TreeNode root) {

        Stack<TreeNode> nodeStack = new Stack<>();
        Stack<Integer> maxStack = new Stack<>();

        nodeStack.push(root);
        maxStack.push(root.val);

        int count = 0;

        while(!nodeStack.isEmpty()){

            TreeNode node = nodeStack.pop();
            int currMax = maxStack.pop();

            if(node.val >= currMax){
                count++;
            }

            int newMax = Math.max(currMax, node.val);

            if(node.left != null){
                nodeStack.push(node.left);
                maxStack.push(newMax);
            }

            if(node.right != null){
                nodeStack.push(node.right);
                maxStack.push(newMax);
            }
        }

        return count;
    }
}