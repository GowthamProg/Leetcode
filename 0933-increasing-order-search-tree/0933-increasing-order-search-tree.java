class Solution {
    public ArrayList<Integer> inorder(TreeNode root,ArrayList<Integer>l){
        if(root==null) return l;
        inorder(root.left,l);
        l.add(root.val);
        inorder(root.right,l);
        return l;
    }
    public TreeNode increasingBST(TreeNode root) {
        ArrayList<Integer>l=inorder(root,new ArrayList<Integer>());
        TreeNode ans=new TreeNode(0);
        TreeNode cur=ans;
        for(int i:l){
            cur.right=new TreeNode(i);
            cur=cur.right;
        }
        return ans.right;
    }
}