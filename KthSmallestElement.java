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
    public int kthSmallest(TreeNode root, int k) {
    List<Integer> m= inorder(root);
    return m.get(k-1);
    
    }
    public List<Integer> inorder(TreeNode root){
        if(root==null){
            return result;
        }
        inorder(root.left);
        result.add(root.val);
        inorder(root.right);
        return result;
    }
}