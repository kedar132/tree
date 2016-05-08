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
    List<TreeNode> n=new LinkedList<TreeNode>();
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null){
            return root;
        }
       List<TreeNode> s=findNode(root,p);
       List<TreeNode> m=findNode(root,q);
       //int i=0;
       for(int i=0;i<s.size();i++){
           
               System.out.println(s.get(i).val);
           
           
       }
       for(int i=0;i<m.size();i++){
           
               System.out.println(m.get(i).val);
           
           
       }
        return root;
    }
    public List<TreeNode> findNode(TreeNode root,TreeNode r){
        if(root==null){
            return n;
        }
        if(root.val==r.val){
            return n;
        }
        if(root.left!=null){
            int length=n.size();
            n.add(root);
            findNode(root.left,r);
            n.remove(length);
        }
        if(root.right!=null){
            int length=n.size();
            n.add(root);
            findNode(root.right,r);
            n.remove(length);
        }
        return n;
    }
}