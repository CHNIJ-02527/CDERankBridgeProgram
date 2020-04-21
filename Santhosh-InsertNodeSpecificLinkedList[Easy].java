

    // Complete the insertNodeAtPosition function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode head, int data, int position) {

SinglyLinkedListNode node = new SinglyLinkedListNode(data);
node.data = data;
node.next = null;

if(head==null){
    head = node;
    return head;
}
else if(position == 0){
node.next = head;
head = node;
return head;
}
else{
    SinglyLinkedListNode c = head;
    while((position-1)>0){
        if(c.next!=null){
            c = c.next;
            position --;
        }
        else{
            break;
        }
    }
    node.next = c.next;
    c.next = node;

    return head;
    }
}

