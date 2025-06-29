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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> a=new ArrayList<List<Integer>>();
        Queue<TreeNode> q=new LinkedList<>();
        if(root==null) return a;
        q.add(root);

        while(q.size()>0){
            int l=q.size();
            List<Integer> s=new ArrayList<>();
            for(int i=0;i<l;i++){
                TreeNode t=q.peek();
                if(t.left!=null) q.add(t.left);
                if(t.right!=null) q.add(t.right);
                s.add(q.poll().val);
            }
            a.add(s);
        }
        return a;
    }
}