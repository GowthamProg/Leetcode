/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */

bool hasCycle(struct ListNode *head)
{
    if(head==NULL || head->next==NULL) return 0;
    struct ListNode *slow=head,*fast=head;
    while(fast!=NULL && fast->next!=NULL)
    {
        slow=slow->next;
        fast=fast->next->next;
        if(slow==fast) return 1;
    }
    return 0;
}

/*
bool hasCycle(struct ListNode *head) {
    if(head==NULL || head->next==NULL) return false;
    struct ListNode *fast=head,*slow=head;
    while(fast!=NULL && fast->next !=NULL)
    {
        slow=slow->next;
        fast=fast->next->next;
        if(slow==fast) return true;
    }
    return 0;
}
*/