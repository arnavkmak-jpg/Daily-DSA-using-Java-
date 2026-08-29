package Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> list = new ArrayList<>(); // Outer list containing each levels

        Queue<TreeNode> queue = new LinkedList<>(); // queue that adds each level and polls them one by one
        queue.add(root);

        while (!queue.isEmpty()){
            List<Integer> level = new ArrayList<>(); // Inner list containing the elements in each level
            for (int i= queue.size()-1; i>=0 ; i--){ // loop through queue until no element remains
                TreeNode node = queue.poll(); // store the value of the node in the new node while removing it
                if (node!=null){
                    level.add(node.val);
                    queue.add(node.left);
                    queue.add(node.right);
                }
            }
            // loop ends for 1 level
            if (level.size()>0){ // check if the inner list contains more than 0 elements
                list.add(level); // add it to outer if it does
            }
        }

        return list;


    }
}
