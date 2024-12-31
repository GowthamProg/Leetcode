int findDuplicate(int* n, int s) {
    int slow=n[0],fast=n[0];
    do
    {
        slow=n[slow];
        fast=n[n[fast]];
    }while(slow!=fast);
    slow=n[0];
    while(slow!=fast)
    {
        slow=n[slow];
        fast=n[fast];
    }
    return slow;
}