package BinaryTree;

import java.util.HashMap;
import java.util.List;
import java.util.Stack;

public class Construct_Binary_Tree_from_Preorder_and_Inorder_Traversal {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder.length < 1) return null;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode root = new TreeNode(preorder[0]);
        stack.push(root);
        HashMap<Integer, Integer> map = new HashMap<>();
        boolean turnRight = false;
        for(int i = 0; i < inorder.length; i++){
            map.put(inorder[i], i);
        }

        TreeNode curr = null;
        for(int i = 1; i < preorder.length; i++){
            TreeNode node = new TreeNode(preorder[i]);
            // determine to turn right
            if(map.get(stack.peek().val) < map.get(preorder[i])){
                while(!stack.isEmpty() && map.get(stack.peek().val) < map.get(preorder[i])){
                    curr = stack.pop();
                }
                curr.right = node;
            }
            else{
                stack.peek().left = node;
            }
            stack.push(node);
        }
        return root;
    }

    public static void main(String args[]){
        int[] preorder = new int[]{3,9,20,15,7};
        int[] inorder = new int[]{9,3,15,20,7};
        Construct_Binary_Tree_from_Preorder_and_Inorder_Traversal s =
                new Construct_Binary_Tree_from_Preorder_and_Inorder_Traversal();
        TreeNode root = s.buildTree(preorder, inorder);
        TreeNode_Basic treeNode_basic = new TreeNode_Basic();
        List<Integer> traversal = treeNode_basic.breadthFirstTraversal(root);
        System.out.println(traversal);
    }
}
