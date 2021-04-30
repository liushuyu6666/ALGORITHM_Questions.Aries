package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class Symmetric_Tree {
    public boolean isSymmetric(TreeNode root){
        if(root == null) return true;
        Queue<TreeNode> left = new LinkedList<>();
        Queue<TreeNode> right = new LinkedList<>();
        left.add(root.left);
        right.add(root.right);
        TreeNode leftCurr;
        TreeNode rightCurr;
        while(!left.isEmpty() && !right.isEmpty()){
            leftCurr = left.poll();
            rightCurr = right.poll();
            if(leftCurr != null && rightCurr != null){
                if(leftCurr.val != rightCurr.val) return false;
                left.add(leftCurr.left);
                left.add(leftCurr.right);
                right.add(rightCurr.right);
                right.add(rightCurr.left);
            }
            else if(leftCurr == null && rightCurr == null){
            }
            else{
                return false;
            }
        }
        if(left.isEmpty() && right.isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String args[]){
        TreeNode treeNode = new TreeNode();
        TreeNode root = treeNode.createTreeNode(new Integer[]{2,3,3,4,5,5});
        Symmetric_Tree symmetric_tree = new Symmetric_Tree();
        System.out.println(symmetric_tree.isSymmetric(root));
    }
}
