/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
    int diameter;
public:
    int getwidth(TreeNode *root)
    {
        if(root==nullptr) return 0;
        int lw=getwidth(root->left);
        int rw=getwidth(root->right);
        diameter=max(diameter,lw+rw);
        return max(lw,rw)+1;
    }
    int diameterOfBinaryTree(TreeNode* root) {
        diameter=0;
        getwidth(root);
        return diameter;
    }
};