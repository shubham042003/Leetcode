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
    static void helper(TreeNode root,List<Integer> a,int l){
        if(root==null) return;
        if(l==a.size()){
            a.add(root.val);
        }
        helper(root.right,a,l+1);
        helper(root.left,a,l+1);
    } 
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> a=new ArrayList<>();
        int l=0;
        helper(root,a,l);
        return a;
    }
}