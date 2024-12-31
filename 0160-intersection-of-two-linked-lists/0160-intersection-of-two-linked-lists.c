/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */

struct ListNode *getIntersectionNode(struct ListNode *headA, struct ListNode *headB) 
{
    struct ListNode *th1=headA,*th2=headB;
    while(th1!=th2)
    {
        th1=th1==NULL?headB :th1->next;
        th2=th2==NULL?headA :th2->next;
    }
    return th1;
}








 /*
 int length(struct ListNode *headA)
 {
    struct ListNode *temp=headA;
    int c=0;
    while(temp!=NULL) 
    {
        c++;
        temp=temp->next;
    }
    return c;
 }
struct ListNode *getIntersectionNode(struct ListNode *headA, struct ListNode *headB) {
    int l1=length(headA);
    int l2=length(headB);
    while(l1>l2)
    {
        headA=headA->next;
        l1--;
    }
    while(l2>l1)
    {
        headB=headB->next;
        l2--;
    }
    while(headA!=headB)
    {
        headA=headA->next;
        headB=headB->next;
    }
    return headA;
}
*/




/*
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
*/