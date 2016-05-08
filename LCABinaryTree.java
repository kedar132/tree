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

     TreeNode result = null;
     
     public int findCommonAncestor(TreeNode root,TreeNode p,TreeNode q){
         if(root==null){
             return -1;
         }

         int left=findCommonAncestor(root.left,p,q);
         int right=findCommonAncestor(root.right,p,q);
         if(left==1|| right==1) return 1;
         if((left==0 && right==0) || ((left==0||right==0) && (root==p || root==q))){
             result=root;
             return 1;
         }
         if(left==0 || right==0)
            return 0;
         if(root==p || root==q) return 0;
        
        return -1;
     }
     
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null|| root==p||root==q){
            return root;
        }
        else 
            findCommonAncestor(root,p,q);
            
        return result;

        
    }

}