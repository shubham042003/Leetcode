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
    int s=0;
    public void helper(TreeNode root){
        if(root.left!=null){
            if(root.left.left==null && root.left.right==null){
                s=s+root.left.val;
            }
            helper(root.left);
        }
        if(root.right!=null){
            helper(root.right);
        }
    }
    public int sumOfLeftLeaves(TreeNode root) {
        if(root==null) return 0;
        helper(root);
        return s;
    }
}