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
    public static boolean helper(TreeNode root,int t,int s){
        if(root==null) return false;
        s=s+root.val;
        if(root.left==null && root.right==null){
            return s==t;
        }
        return helper(root.left,t,s) || helper(root.right,t,s);
    }
    public boolean hasPathSum(TreeNode root, int t) {
        int s=0;
        return helper(root,t,s);
    }
}