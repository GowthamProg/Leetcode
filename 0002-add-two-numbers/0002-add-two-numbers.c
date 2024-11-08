    /**
    * Definition for singly-linked list.
    * struct ListNode {
    *     int val;
    *     struct ListNode *next;
    * };
    */
    struct ListNode* addTwoNumbers(struct ListNode* l1, struct ListNode* l2) {
    struct ListNode* ans=l1;
    int carry=0;
    while(l1!=NULL || l2!=NULL || carry!=0)
    {
        int sum=carry;
        carry=0;
        if(l1!=NULL) sum=sum+l1->val;
        if(l2!=NULL) sum=sum+l2->val;
        if(sum>9){ sum=sum%10; carry=1;}
        if(l1!=NULL && l1->next==NULL && (l2!=NULL && l2->next!=NULL) )
        {
            l1->next=(struct ListNode*) malloc(sizeof(struct ListNode));
            l1->next->val=0;
            l1->next->next=NULL;
        }
        if(l2!=NULL && l2->next==NULL && (l1!=NULL && l1->next!=NULL))
        {
            l2->next=(struct ListNode*) malloc(sizeof(struct ListNode));
            l2->next->val=0;
            l2->next->next=NULL;
        }
        if(l1!=NULL && l1->next==NULL && l2!=NULL && l2->next==NULL && carry>0)
        {
            l1->next=(struct ListNode*)malloc(sizeof(struct ListNode));
            l1->next->val=0;
            l1->next->next=NULL;
        }
        if(l1!=NULL)l1->val=sum;
        if(l1!=NULL)l1=l1->next;
        if(l2!=NULL)l2=l2->next;
        sum=0;

    }
    return ans;
    }