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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null)
            return ans;
        
        Queue<TreeNode> queue = new LinkedList<>();
        int size;
        Boolean leftToRight = true;
        TreeNode curr;
        queue.offer(root);
        
        while(!queue.isEmpty()){
            List<Integer> currentLevel = new LinkedList<>();
            size = queue.size();
            while(size>0){
                curr = queue.poll();
                if(leftToRight){
                    currentLevel.add(curr.val);
                } else {
                    currentLevel.add(0,curr.val);
                }
                if(curr.left!=null){
                    queue.offer(curr.left);
                }
                if(curr.right!=null){
                    queue.offer(curr.right);
                }
                size--;
            }
            ans.add(currentLevel);
            leftToRight = !leftToRight;
        }
        return ans;
    }
}