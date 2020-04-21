 static SinglyLinkedListNode removeDuplicates(SinglyLinkedListNode head) {

         if (head == null)
        return null;
    SinglyLinkedListNode tail = head;
    for (SinglyLinkedListNode curr = head.next; curr != null; curr = curr.next) {
        if (curr.data != tail.data) {
            tail.next = curr;
            tail = tail.next;
        }
    }
    tail.next = null;
    return head;
}
