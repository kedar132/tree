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
    List<List<Integer>> l1=new LinkedList<List<Integer>>();
    List<Integer> l2=new LinkedList<Integer>();
    public int sumNumbers(TreeNode root) {
    
        List<List<Integer>> result=root_leaf(root);
        int[] arr=new int[result.size()];
        int j=0;
        int sum=0;
         for (List<Integer> al : result) {
             
             for(int i=0;i<al.size();i++){
                 
                j=(j*10)+al.get(i);
             }
             sum=sum+j;
             j=0;
         }
        
         return sum;
        
    }
    public List<List<Integer>> root_leaf(TreeNode root){
        if(root==null){
            return l1;
        }
        if(root.left==null && root.right==null){
            int len=l2.size();
            l2.add(root.val);
            List<Integer> l3=new LinkedList<Integer>();
            l3.addAll(l2);
            l1.add(l3);
            l2.remove(len);
            
        }
        if(root.left!=null){
            int len=l2.size();
            l2.add(root.val);
            root_leaf(root.left);
            l2.remove(len);
            
        }
        
        if(root.right!=null){
            int len=l2.size();
            l2.add(root.val);
            root_leaf(root.right);
            l2.remove(len);
            
        }
        
        return l1;
    }
}