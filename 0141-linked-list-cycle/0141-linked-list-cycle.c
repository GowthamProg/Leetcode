/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
bool hasCycle(struct ListNode *head) {
    struct ListNode* slow = head,*fast = head;
    while(fast){
        fast = fast ->next;
        if(slow==fast) return true;
        slow=slow->next;
        if(fast==NULL) return false;
        fast = fast ->next;
    }
    return false;
}