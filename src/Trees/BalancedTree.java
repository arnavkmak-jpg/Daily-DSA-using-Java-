package Trees;

public class BalancedTree {
    private boolean isBalanced = true;
    public boolean isBalanced(TreeNode root) {

        height(root);  // call the height method to find the height of the tree
        return isBalanced; // return the flag value whether true or false



    }

    private int height(TreeNode root){
        if (root==null) return 0; // if the root is null the height will be 0

        int left = height(root.left); // height for left subtree
        int right = height(root.right); // height for right subtree

        if (Math.abs(left-right)>1){ // difference between height of left and right subtree
            isBalanced = false; // set the flag as false which means the tree is not balanced
        }

        return 1+Math.max(left,right); // return the height with maximum height of the subtree among the left and right

    }
}
