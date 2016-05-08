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
    

    public List<List<Integer>> levelOrder(TreeNode root) {
    
    List<List<Integer>> res= new LinkedList<List<Integer>>();
    if(root==null){
        return res;
    }
    List<Integer> tempRes = new LinkedList<Integer>();
    List<TreeNode> temporary = new LinkedList<TreeNode>();
    temporary.add(root);
    tempRes.add(root.val);
    res.add(tempRes);
    
    
    return levelOrder(res,temporary);
     }
            
            
            
    public static List<List<Integer>> levelOrder(List<List<Integer>> res,List<TreeNode> temporary){
        if(temporary.size()<1){
            return res;
        }
      
      List<Integer> resultadd = new LinkedList<Integer>();
      List<TreeNode> resadd = new LinkedList<TreeNode>();
     
      for(TreeNode tempRoot : temporary ){
      
              if(tempRoot.left!=null){
                  
                  resultadd.add(tempRoot.left.val);
                  resadd.add(tempRoot.left);
              }
              if(tempRoot.right!=null){
              
              resultadd.add(tempRoot.right.val);
              resadd.add(tempRoot.right);
              }
              
      }
      if(resultadd.size()>0){
      res.add(resultadd);
      }
      return levelOrder(res,resadd);
      
      }      
}