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
    private int index=0;
    public TreeNode helper(int[] preorder,int leftLim,int rightLim){
        if(index>=preorder.length)  return null;
        TreeNode root=new TreeNode(preorder[index]);
        if(root.val < leftLim || root.val>rightLim){
            return null;
        } 
        index++;
        root.left = helper(preorder, leftLim, root.val);  // Left child: values < root value
        root.right =helper(preorder, root.val, rightLim);  // Right child: values > root value
        
        return root;

    }
    public TreeNode bstFromPreorder(int[] preorder) {
        return helper(preorder,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }
}