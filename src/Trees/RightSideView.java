package Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class RightSideView {
    public List<Integer> rightSideView(TreeNode root) {

        List<Integer> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()){
            int qLen = queue.size(); // set length of queue to what it is currently 1st iteration 1 for root and increases each iteration corresponding to number of children nodes in it
            TreeNode right = null; // initiate a node that will track the rightmost element

            for (int i=0; i<qLen; i++){ // loop will execute if amount of times which is the value of queue length set before the loop
                TreeNode node = queue.poll(); // put the value of poll in a new node
                if (node!=null){
                    right = node; // set the rightmost element as node if it is not null
                    queue.add(node.left);
                    queue.add(node.right);

                }
            }
            if (right!=null){ // this successfully checks if the right is still null the tree is empty
                list.add(right.val);
            }
        }

        return list;

    }
}
