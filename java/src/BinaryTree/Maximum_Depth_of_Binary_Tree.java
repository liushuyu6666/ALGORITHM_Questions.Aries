package BinaryTree;

import java.util.Stack;

public class Maximum_Depth_of_Binary_Tree {
    public int maxDepth(TreeNode root){
        Stack<TreeNode> stack = new Stack<>();
        Stack<Integer> depthStack = new Stack<>();
        int depth = 0, ans = 0;
        TreeNode curr = root;
        while(curr != null || !stack.isEmpty()){
            if(curr != null){
                depth++;
                stack.push(curr);
                depthStack.push(depth);
                curr = curr.left;
            }
            else{
                curr = stack.pop();
                depth = depthStack.pop();
                ans = Math.max(ans, depth);
                curr = curr.right;
            }
        }
        return ans;
    }

    public static void main(String args[]){
        TreeNode treeNode = new TreeNode();
        TreeNode root = treeNode.createTreeNode(new Integer[]{1, 2, 3, 4, 5, 6, 7,
                8, 9, null, 10, null, 11, 13});
        Maximum_Depth_of_Binary_Tree s = new Maximum_Depth_of_Binary_Tree();
        System.out.println(s.maxDepth(root));
    }
}
