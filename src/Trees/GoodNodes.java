package Trees;

public class GoodNodes {
    public int goodNodes(TreeNode root) {
        return dfs(root, root.val);
    }

    private int dfs(TreeNode root, int max){
        if (root==null){  //base case
            return 0;
        }

        int count = (root.val>=max)?1:0; // check if value of root is greater than or equal to the max value if yes we increase count of good node by one if no we don't
        max = Math.max(root.val,max); // also if the value is greater than max we update the max to the new greater value

        count+= dfs(root.left,max); // now we do recursion through left and right node and check if they are greater than max if they are we increase count by one
        count+= dfs(root.right,max);

        return count;
    }


}
