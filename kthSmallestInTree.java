class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
}
public class kthSmallestInTree {
    public int kthSmallest(TreeNode root, int k) {
        // currentsmall is the current node's samllest number 
        int currentsmall= findsmallnumber(root.left)+1;
        if (k==currentsmall){
            // if equal, which means we should return the kth smallest value
            return root.val;
        }
        // if currentsmall number is larger which means we should go to left to search
        else if (k<currentsmall){
            return kthSmallest(root.left,k);
        }
        else {
            // other wise we got to right tree and also take the all the left number into considersation
            // so we let k-currentsmall be new k
            return kthSmallest(root.right,k-currentsmall);
        }
    }
    public int findsmallnumber(TreeNode root){
        if (root==null){
            return 0;
        }
        return 1+findsmallnumber(root.left)+findsmallnumber(root.right);
    }
}