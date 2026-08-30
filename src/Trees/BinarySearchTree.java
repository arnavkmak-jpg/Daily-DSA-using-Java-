package Trees;

public class BinarySearchTree {
    public boolean isValidBST(TreeNode root) {

        return valid(root,Long.MIN_VALUE,Long.MAX_VALUE); // min value and max value sets value of left and right as the minimum and maximum possible value of long
    }
    public boolean valid (TreeNode root, long left, long right){
        if (root==null) return true; // null tree is a binary search tree

        if (!(left< root.val && root.val< right)){ // check condition if left value is not less than value of node and right value is not higher than value of node
            return false; //  we return false if condition satisfies
        }

        return valid(root.left,left,root.val) && valid(root.right,root.val,right); // we apply recursion to apply the method on the other nodes where for left node we check if it is between left value (-inf) and node value similarly for right we check if it is between node value and right value (inf)
    }


}
