package BinaryTree;

import sun.reflect.generics.tree.Tree;

import java.util.Stack;

public class Validate_Binary_Search_Tree {
    public boolean isValidBST(TreeNode root){
        Stack<TreeNode> stack = new Stack<>();
        Integer prev = null;
        TreeNode curr = root;
        while(curr != null || !stack.isEmpty()){
            if(curr != null){
                stack.push(curr);
                curr = curr.left;
            }
            else{
                curr = stack.pop();
                if(prev != null && curr.val != null && prev >= curr.val){
                    return false;
                }
                prev = curr.val;
                curr = curr.right;
            }
        }
        return true;
    }

    public static void main(String args[]){
        TreeNode treeNode = new TreeNode();
        TreeNode root = treeNode.createTreeNode(new Integer[]{5,1,4,null,null,3,6});
        Validate_Binary_Search_Tree vbst =
                new Validate_Binary_Search_Tree();
        System.out.println(vbst.isValidBST(root));
    }

}
