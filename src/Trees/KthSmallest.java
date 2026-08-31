package Trees;

import java.util.ArrayList;
import java.util.List;

public class KthSmallest {
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> list = new ArrayList<>();
        inOrder(root,list);
        return list.get(k-1);
        
    }
    public void inOrder(TreeNode root, List<Integer> list){
        if (root==null) return;

        inOrder(root.left,list); // in order traversal left -> root -> right
        list.add(root.val);
        inOrder(root.right,list);
    }
}
