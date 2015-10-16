import java.util.*;
class TreeNode {
         int val;
         TreeNode left;
         TreeNode right;
         TreeNode(int x) { val = x; }
}
class Solution {
    public static List<Integer> inorderTraversal(TreeNode root) {
        if (root == null){
            return null;
        }
        TreeNode current=root;
        List<Integer> newone = new ArrayList<Integer>();
        List<TreeNode> haveadd = new ArrayList<TreeNode>(); 
        Stack<TreeNode> tree_traverse = new Stack<TreeNode>();
        int leftorright =0;
        for (;;){
            if (checkleft(current)&&!haveadd.contains(current.left)){
                tree_traverse.push(current);
		//System.out.println("left push is "+current.val);
                current=current.left;
                leftorright=1;
                continue;
            }
            if (!haveadd.contains(current)){
                newone.add(current.val);
		System.out.println(current.val);
                haveadd.add(current);
		//leftorright =1;
		current.left=null;
		//System.out.println("left has been deleted");
            }
	    else{
	        //System.out.println(current.val + "right has been deleted");
		current.right =null;
		//leftorright = -1;
	    }

            if (checkright(current)){
                //System.out.println("right push is "+current.val);
                tree_traverse.push(current);
                current=current.right;
                leftorright=-1;
                continue;
            }
	    else{
	    }
            if (tree_traverse.empty()){
		//System.out.println("empty is true");
                break;
            }
            else{
                current=tree_traverse.pop();
		//System.out.println("pop is "+current.val);
		/*if (leftorright==1){
                    current.left=null;
                }
                else if (leftorright == -1){
                    current.right=null;
		    }*/
            }
            
        }
        return newone;
    }
    public static boolean checkleft(TreeNode root){
        if (root.left == null){
            return false;
        }
        else{
            return true;
        }
    }
    public static boolean checkright(TreeNode root ){
        if (root.right == null){
            return false;
        }
        else{
            return true;
        }
    }
}
class traversal{
    public static void main(String[] args){
	TreeNode n1 =new TreeNode(2);
	n1.left=new TreeNode(1);
	n1.right=new TreeNode(3);
	n1.right.right=new TreeNode(7);
	n1.left.right = new TreeNode(4);
	n1.left.left = new TreeNode(6);      
	Solution.inorderTraversal(n1);
    }
}