package Trees;

public class TreeDiameter {
    private int max = 0; // 1. Declare a class variable max that calcs maximum diameter
    public int diameterOfBinaryTree(TreeNode root) {
        getHeight(root);
        return max;
    }
    private int getHeight(TreeNode root){ // 2. declare a private method to get the maximum height
        if (root==null) return 0;

        int left = getHeight(root.left);
        int right = getHeight(root.right);

        max = Math.max(max,left+right);

        return 1+Math.max(left,right);
    }
}
