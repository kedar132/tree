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
    List<TreeNode> n1=new LinkedList<TreeNode>();
    List<List<Integer>> l=new LinkedList<List<Integer>>();
    List<Integer> l1=new LinkedList<Integer>();
  //  List<Integer> l2=new LinkedList<Integer>(); 
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        if(root==null){
            return l;
        }
       List<TreeNode> s=findNode(root,6);
       List<TreeNode> m=findNode(root,7);
       int i=0;
      // System.out.println(m.size());
           
       while(i<s.size()&&i<m.size()){
        if(s.get(i).val!=m.get(i).val){
        System.out.println(s.get(i-1).val);
        }
        i++;
       }
       
           System.out.println(s.get(i-1).val);
       
       
          
       
       
        return l;
    }
    public List<TreeNode> findNode(TreeNode root,int r){
        if(root==null){
            return n;
        }
        if(root.val==r){
             n1=new LinkedList<TreeNode>();
            n1.addAll(n);
            return n1;
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
        return n1;
        
        
    }
}