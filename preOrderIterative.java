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
    public List<Integer> preorderTraversal(TreeNode root) {
        int max=0;
        List<Integer> arr=new ArrayList<Integer>();
        Stack<TreeNode> stck=new Stack<TreeNode>();
        if(root==null){
            return arr;
        }
        stck.push(root);
        
        while(!stck.empty()){
            root=stck.pop();
          
            arr.add(root.val);
            if(root.right!=null){
                stck.push(root.right);
            }
            if(root.left!=null){
                stck.push(root.left);
            }
           
        }
        
       
        return arr;
    }
}