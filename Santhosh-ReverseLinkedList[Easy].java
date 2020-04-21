

    // Complete the reverse function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode reverse(SinglyLinkedListNode head) {
    if(head==null)
    return null;
    if(head.next == null){
        return head;
    }
    SinglyLinkedListNode n = head.next;
    SinglyLinkedListNode p = null;
    SinglyLinkedListNode c = head;
    while(n!=null){
        c.next = p;
        p = c;
        c = n;
        n = n.next;
    }
    c.next = p;
    return c;
    }

