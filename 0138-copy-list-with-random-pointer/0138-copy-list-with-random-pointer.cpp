/*
// Definition for a Node.
class Node {
public:
    int val;
    Node* next;
    Node* random;
    
    Node(int _val) {
        val = _val;
        next = NULL;
        random = NULL;
    }
};
*/

class Solution {
public:
    Node* copyRandomList(Node* head) {
        Node *th=head;
        if(head==NULL) return NULL;
        while(th!=NULL)
        {
            Node *nn=new Node(th->val);
            nn->next=th->next;
            th->next=nn;
            th=nn->next;
        }
        th=head;
        while(th)
        {
            th->next->random = th->random ?th->random->next :NULL;
            th=th->next->next;
        }
        Node *th1=head;
        Node *ans=head->next;
        Node *th2=head->next;
        while(th1)
        {
            th1->next=th2->next;
            th2->next=th1->next ? th1->next->next :NULL;
            th1=th1->next;
            th2=th2->next;
        }
        return ans;
    }
};