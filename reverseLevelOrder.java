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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
         List<List<Integer>> n = new LinkedList<List<Integer>>();
        LinkedList<TreeNode> q = new LinkedList<TreeNode>();
        List<Integer> n1 = new LinkedList<Integer>();
        Stack<TreeNode> S1=new Stack<TreeNode>();
        
        
        if(root!=null){
            
            q.add(root);
            q.add(null);
        }
        while(!q.isEmpty()){
            TreeNode temp=q.remove();
            S1.push(temp);
            //System.out.println(S1.pop());
            if(temp==null){
                if(!q.isEmpty()){
                q.add(null);
                }
            }
            else{
                   if(temp.right!=null){
                q.add(temp.right);
            
          }
            if(temp.left!=null){
                q.add(temp.left);
            }
             
            }
            
        }
        if(S1.empty()){
            return n;
        }
       S1.pop();
        
      while(!S1.empty()){
          TreeNode temp=S1.pop();
        if(temp==null){
            n.add(n1);
            n1=new LinkedList<Integer>();
        }
        else{
            n1.add(temp.val);
        }
        if(S1.empty()){
            n.add(n1);
        }
          
          
         
      }
      //n.add(n1);
        return n;
    }
}