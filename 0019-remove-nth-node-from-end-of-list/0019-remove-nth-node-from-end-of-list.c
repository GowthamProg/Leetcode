/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
 int check(struct ListNode* head)
 {
    int i=0;
    while(head!=NULL){
        ++i;
        head=head->next;
    }
    return i;
 }
struct ListNode* removeNthFromEnd(struct ListNode* head, int n) {
    int i=check(head);
    struct ListNode* bp=head;
    if(i==1) return NULL;
    if(n==1)
    {
        printf("Hi");
        while(head->next->next!=NULL) head=head->next;
        head->next=NULL;
        return bp;
    }
    if(i==n){
        struct ListNode* temp= head->next;
        return temp;
    }
    i=i-n;
    while(--i) head=head->next;
    struct ListNode* temp=head->next->next;
    head->next=temp;
    return bp;
}