package BinaryTree;

import sun.reflect.generics.tree.Tree;

import javax.print.attribute.IntegerSyntax;
import java.util.*;

public class TreeNode_Basic {

    public TreeNode createTreeNode(Integer[] nums){
        if(nums.length < 1) return null;
        if(nums[0] == null) return null;
        TreeNode root = new TreeNode(nums[0]);
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        TreeNode curr;
        int i = 1;
        while(i < nums.length){
            curr = q.poll();
            if (nums[i] == null) {
                curr.left = new TreeNode(null);
            } else {
                curr.left = new TreeNode(nums[i]);
                q.add(curr.left);
            }
            i++;
            if(i < nums.length){
                if(nums[i] == null){
                    curr.right = new TreeNode(null);
                }else{
                    curr.right = new TreeNode(nums[i]);
                    q.add(curr.right);
                }
                i++;
            }
        }
        return root;
    }

    public List<Integer> breadthFirstTraversal(TreeNode root){
        Queue<TreeNode> q = new LinkedList<>();
        List<Integer> traversal = new ArrayList<>();
        TreeNode curr = root;
        while(curr != null || !q.isEmpty()){
            if(curr != null){
                traversal.add(curr.val); // traverse happens here
                if(curr.left != null) q.add(curr.left);
                if(curr.right != null) q.add(curr.right);
                curr = q.poll();
            }
        }
        return traversal;
    }

    public List<Integer> inOrderDepthFirstTraversal(TreeNode root){ // left root right
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> traversal = new ArrayList<>();
        TreeNode curr = root;
        while(curr != null || !stack.isEmpty()){
            if(curr != null){
                stack.push(curr);
                curr = curr.left;
            }
            else{
                curr = stack.pop(); // when the node is popped out, its left subtree must be traversed !
                traversal.add(curr.val); // traverse happens here
                curr = curr.right;
            }
        }
        return traversal;
    }

    public List<Integer> preOrderDepthFirstTraversal(TreeNode root){ // root left right
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> traversal = new ArrayList<>();
        TreeNode curr = root;
        while(curr != null || !stack.isEmpty()){
            if(curr != null){
                traversal.add(curr.val); // traverse happens here
                stack.push(curr);
                curr = curr.left;
            }
            else{
                curr = stack.pop(); // when the node is popped out, its left subtree and itself must be traversed
                curr = curr.right;
            }
        }
        return traversal;
    }

    public List<Integer> postOrderDepthFirstTraversal(TreeNode root){ // left, right, root
        Stack<TreeNode> upperStack = new Stack<>();
        Stack<TreeNode> lowerStack = new Stack<>();
        List<Integer> traversal = new ArrayList<>();
        TreeNode curr = root;
        while(curr != null || !upperStack.isEmpty()){
            if(curr != null){
                upperStack.push(curr.left);
                upperStack.push(curr.right);
                lowerStack.push(curr);
                curr = upperStack.pop();
            }
            else{
                curr = upperStack.pop();
            }
        }
        while(!lowerStack.isEmpty()){
            traversal.add(lowerStack.pop().val); // traverse happens here
        }
        return traversal;
    }

    // application
    public int maxDepthInOrder(TreeNode root){
        // use inOrder traverse, left, root, right
        Stack<TreeNode> stack = new Stack<>();
        Stack<Integer> depthStack = new Stack<>();
        TreeNode curr = root;
        int depth = 0, ans = 0;
        while(!stack.isEmpty() || curr != null){
            if(curr != null){
                depth++;
                stack.push(curr);
                depthStack.push(depth);
                curr = curr.left;
            }
            else{
                curr = stack.pop();
                depth = depthStack.pop(); // traverse happens here
                ans = Math.max(ans, depth);
                curr = curr.right;
            }
        }
        return ans;
    }

    public int maxDepthPreOrder(TreeNode root){ // root, left, right
        Stack<TreeNode> stack = new Stack<>();
        Stack<Integer> depthStack = new Stack<>();
        TreeNode curr = root;
        int depth = 0, ans = 0;
        while(curr != null || !stack.isEmpty()){
            if(curr != null){
                depth++;
                ans = Math.max(ans, depth);
                stack.push(curr);
                depthStack.push(depth);
                curr = curr.left;
            }
            else{
                curr = stack.pop();
                depth = depthStack.pop();
                curr = curr.right;
            }
        }
        return ans;
    }

    public static void main(String args[]){
        Integer[] nums = new Integer[]{1, 2, 3, 4, 5, 6, 7,
                8, 9, null, 10, null, 11, 13};
        TreeNode_Basic tnb = new TreeNode_Basic();
        TreeNode root = tnb.createTreeNode(nums);
        List<Integer> breadthFirstTraversal = tnb.breadthFirstTraversal(root);
        List<Integer> inOrderDepthFirstTraversal = tnb.inOrderDepthFirstTraversal(root);
        List<Integer> preOrderDepthFirstTraversal = tnb.preOrderDepthFirstTraversal(root);
        List<Integer> postOrderDepthFirstTraversal = tnb.postOrderDepthFirstTraversal(root);
        int maxDepthInOrder = tnb.maxDepthInOrder(root);
        int maxDepthPreOrder = tnb.maxDepthPreOrder(root);
        System.out.println(breadthFirstTraversal);
        System.out.println(inOrderDepthFirstTraversal);
        System.out.println(preOrderDepthFirstTraversal);
        System.out.println(postOrderDepthFirstTraversal);
        System.out.println(maxDepthInOrder);
        System.out.println(maxDepthPreOrder);
    }
}
