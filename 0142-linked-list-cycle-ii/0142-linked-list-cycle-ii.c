/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode *detectCycle(struct ListNode *head) {
    if(!head || !head->next) return NULL;
    struct ListNode *slow=head,*fast=head;
    while(fast && fast->next){
        slow = slow->next;
        fast = fast->next->next;
        if(slow==fast){
            struct ListNode *ptr1 = head;
            struct ListNode *ptr2 = slow;
            while(ptr1!=ptr2){
                ptr1 = ptr1->next;
                ptr2 = ptr2->next;
            }
            return ptr1;
        }
    }
    return NULL;
}