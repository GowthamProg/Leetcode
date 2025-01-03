/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */
void check(struct TreeNode *root,int *res,int* index)
{
    if(root ==NULL) return;
    check(root->left,res,index);
    check(root->right,res,index);
    res[(*index)++]=root->val;
}
bool isUnivalTree(struct TreeNode* root) {
    int *a=(int*)malloc(100*sizeof(int));
    int index=0;
    int *ref=&index;
    check(root,a,ref);
    for(int i=0;i<index-1;i++)
        if(a[i]!=a[i+1])
            return 0;
    return 1;
}