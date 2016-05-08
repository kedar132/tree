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
    List<Integer> result=new ArrayList<Integer>();
    public List<Integer> inorderTraversal(TreeNode root) {
        
       if(root==null){
           return result;
       }
       inorderTraversal(root.left);
       result.add(root.val);
       inorderTraversal(root.right);
       return result;
    }
}