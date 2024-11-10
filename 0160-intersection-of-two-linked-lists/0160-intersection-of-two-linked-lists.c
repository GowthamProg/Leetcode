/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode *getIntersectionNode(struct ListNode *headA, struct ListNode *headB) {
    struct ListNode *temp=headB;
    while(headA!=NULL)
    {
        headB=temp;
        while(headB!=NULL)
        {
            if(headA==headB) return headA;
            //if(headB->next==NULL) return headB;
            headB=headB->next;
        }
        headA=headA->next;
    }
    return 0;
}