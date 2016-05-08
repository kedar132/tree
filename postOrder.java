/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    ArrayList<Integer> n=new ArrayList<Integer>();
    public List<Integer> postorderTraversal(TreeNode root) {
        if(root==null){
            return n;
        }
        else{
            postorderTraversal(root.left);
            postorderTraversal(root.right);
            n.add(root.val);
        }
        return n;
    }
    
}