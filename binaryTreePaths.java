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
    List<String> s=new LinkedList<String>();
    public List<String> binaryTreePaths(TreeNode root) {
   
    StringBuilder sb=new StringBuilder();
       if(root==null){
           return s;
       } 
        return binaryTreePaths(root,sb);
       
    }
    public List<String> binaryTreePaths(TreeNode root,StringBuilder sb){
        if(root==null){
            return s;
        }
        else{
             if(root.left==null && root.right==null){
                 int len=sb.length();
                sb.append(root.val);
                String S1=sb.toString();
                s.add(S1);
                sb.setLength(len);
                return s;
            }
            sb.append(root.val+"->");
            if(root.left!=null){
                int len=sb.length();
                binaryTreePaths(root.left,sb);
                sb.setLength(len);
            }
            if(root.right!=null){
                 int len=sb.length();
                binaryTreePaths(root.right,sb);
                sb.setLength(len);
            }
           
        }
        return s;
    }
}