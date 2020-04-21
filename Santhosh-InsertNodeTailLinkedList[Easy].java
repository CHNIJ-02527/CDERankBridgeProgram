

    // Complete the insertNodeAtTail function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {
       SinglyLinkedListNode slln = new SinglyLinkedListNode(data);
        if(head==null){
            return slln;
        }
        SinglyLinkedListNode position = head;
        while(position.next != null){
            position=position.next; 
        }
        position.next = slln;
        return head;
    }

