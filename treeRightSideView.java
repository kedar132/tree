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
    public List<Integer> rightSideView(TreeNode root) {
    LinkedList<TreeNode> q = new LinkedList<TreeNode>();
    List<Integer> a=new ArrayList<Integer>();
    int flag=0;
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
        flag=0;
        
    }
    else{
        if(flag==0){
            
    a.add(temp.val);
        flag=1;
            
        }
    if(temp.right!=null){
        q.add(temp.right);
    }
    
    if(temp.left!=null){
        q.add(temp.left);
    }
    }
    }
  
  return a;
}
}