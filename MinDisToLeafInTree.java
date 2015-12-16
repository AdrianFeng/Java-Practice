import java.util.*;
class TreeNode {
  int val;
  TreeNode left;
  TreeNode right;
  TreeNode(int x) { val = x; }
}
public class MinDisToLeafInTree{
    public int minDepth(TreeNode root) {
        // bfs
        int treeHeights=0;
        if (root == null){
            return treeHeights;
        }
        Queue<TreeNode> visited = new LinkedList<TreeNode>();
        visited.add(root);
        int previousNum=1;
        int currentNum=0;treeHeights=1;
        while (visited.size()!=0){
            while(previousNum!=0){
                TreeNode current = visited.poll();
                if (current.left != null){
                    visited.add(current.left);currentNum++;
                }
                if (current.right !=null){
                    visited.add(current.right);currentNum++;
                }
                if (current.left == null && current.right == null){
                    return treeHeights;
                }
                previousNum--;
            }
            treeHeights++; previousNum= currentNum; currentNum=0;
        }
        return treeHeights;
    }
}