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
class IndexPair{
    TreeNode node;
    int index;
    IndexPair(TreeNode _node, int _index){
        node = _node;
        index = _index;
    }
}
class Solution {
    public int widthOfBinaryTree(TreeNode root) {

        Queue<IndexPair> queue = new LinkedList<>();
        queue.offer(new IndexPair(root, 0));
        int ans = 0;
        while(!queue.isEmpty()){
            int l = queue.size();
            IndexPair curr;
            int min = queue.peek().index;
            int li=min,ri=0;
            for(int i=0; i<l; i++){
                curr = queue.poll();
                if(curr.node.left!=null){
                    queue.offer(new IndexPair(curr.node.left, (curr.index-min)*2+1));
                }
                if(curr.node.right!=null){
                    queue.offer(new IndexPair(curr.node.right, (curr.index-min)*2+2));
                }
                if(i==l-1)
                    ri=curr.index;
            }
            ans = Math.max(ans,(ri-li+1));
        }
        return ans;
    }
}