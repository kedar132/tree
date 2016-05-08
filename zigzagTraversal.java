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
   
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> n = new LinkedList<List<Integer>>();
        LinkedList<TreeNode> q = new LinkedList<TreeNode>();
        List<Integer> n1 = new LinkedList<Integer>();
        int count=0;
        
        if(root!=null){
            q.add(root);
            q.add(null);
        }
        while(!q.isEmpty()){
            TreeNode temp=q.remove();
            if(temp==null){
                if(!q.isEmpty()){
                q.add(null);
                }
                count++;
                if(count%2==0){
                    n.add(reverse(n1));
                }
                else{
                n.add(n1);
                }
                n1=new LinkedList<Integer>();
               
               
            }
            else{
                
          
            n1.add(temp.val);
            
            
            
            if(temp.left!=null){
                q.add(temp.left);
            }
            if(temp.right!=null){
                q.add(temp.right);
            
          } 
            }
           
            
            
        }

        
       
        return n;
        
    }
    public List<Integer> reverse(List<Integer> list) {
    if(list.size() > 1) {                   
        int value = list.remove(0);
        reverse(list);
        list.add(value);
    }
    return list;
}
}