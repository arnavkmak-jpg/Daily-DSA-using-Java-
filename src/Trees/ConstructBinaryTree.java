package Trees;

import java.util.HashMap;

public class ConstructBinaryTree {
    int pre_idx=0;
    HashMap<Integer,Integer> map =  new HashMap<>();

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for (int i = 0; i<inorder.length; i++){ // loop through inorder array and map key to the element and value to the index
            map.put(inorder[i],i);
        }

        return dfs(preorder,0,inorder.length-1);

    }

    private TreeNode dfs(int[] preorder, int l, int r){
        if (l>r) return null; // if left pointer in inorder array is more than right which means the array is null

        int rVal = preorder[pre_idx++]; // 1st element of preorder will always be root
        TreeNode root = new TreeNode(rVal); // make a new node root and put value of it in it
        int mid = map.get(rVal); // returns the index of the root in stored in the map as the value

        root.left = dfs(preorder,l,mid-1); // everything left to root in inorder will be left subtree and on the right will be right subtree
        root.right = dfs(preorder,mid+1,r);
        return root;
    }
}
