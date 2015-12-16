import java.util.*;
class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
}
public class printBSTZigzag {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        //System.out.println("here");
        int level =0;
        if (root == null ){
            return result;
        }
        //System.out.println("HERE ");
        Queue<TreeNode> TreeStore = new LinkedList<TreeNode>();
        TreeStore.add(root);
        int previous=1;
        int present=0;
        while (TreeStore.size()!=0){
            List<Integer> levelVal = new ArrayList<Integer>();
            while (previous>0){
                TreeNode current = TreeStore.poll();
                levelVal.add(current.val);
                //System.out.println(current.val);
                if (current.left!=null){
                    TreeStore.add(current.left);present++;
                }
                if (current.right!=null){
                    TreeStore.add(current.right);present++;
                }
                previous--;
            }
            if (level%2 !=0){
                Collections.reverse(levelVal);
            }
            result.add(levelVal); previous =present; present =0;level++;
        }
        return result;  
    }
}