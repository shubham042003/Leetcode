/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public static void helper(List<String> ans,TreeNode root,String w){
        if(root==null) return;
        if(root.left==null && root.right==null){
            w+=root.val;
            ans.add(w);
        }
        helper(ans,root.left,w+root.val+"->");
        helper(ans,root.right,w+root.val+"->");
    }
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans=new ArrayList<>();
        helper(ans,root,"");
        return ans;
    }
}