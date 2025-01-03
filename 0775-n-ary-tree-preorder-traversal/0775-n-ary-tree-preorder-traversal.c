/**
 * Definition for a Node.
 * struct Node {
 *     int val;
 *     int numChildren;
 *     struct Node** children;
 * };
 */

/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
void pre(struct Node *root,int *index,int *res)
{
    if(root==NULL) return;
    res[(*index)++]=root->val;
    for(int i=0;i<root->numChildren;i++)
    pre(root->children[i],index,res);
}
int* preorder(struct Node* root, int* r) {
    int *res=(int*)malloc(10000*sizeof(int));
    *r=0;
    pre(root,r,res);
    return res;
}