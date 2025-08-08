/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* removeNthFromEnd(struct ListNode* head, int n) {
    struct ListNode* temp = head,*del;
    int count = 0;
    if(head->next == NULL ) return NULL;
    while(temp){
        ++count;
        temp = temp->next;
    }
    printf("%d ",count);
    temp = head;
    count = count - n;
    if(count ==0 ) return head = head ->next;
    while((count-- - 1)>0){
        temp = temp->next;
    }
    printf("%d ",temp -> val);
    del = temp ->next;
    if(del==NULL)
        temp->next = NULL;
    else
        temp->next = del ->next;
    free(del);
    return head;
}