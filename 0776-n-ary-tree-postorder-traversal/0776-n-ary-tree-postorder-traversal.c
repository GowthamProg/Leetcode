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
void post(struct Node* root, int* index,int *res)
{
    if(root==NULL) return;
    for(int i=0;i<root->numChildren;i++)
    post(root->children[i],index,res);
    res[(*index)++]=root->val;
}
int* postorder(struct Node* root, int* r) {
    int *res=(int*)malloc(100*sizeof(int));
    *r=0;
    post(root,r,res);
    return res;
}