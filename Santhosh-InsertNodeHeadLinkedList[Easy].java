

    // Complete the insertNodeAtHead function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode insertNodeAtHead(SinglyLinkedListNode llist, int data) {
        SinglyLinkedListNode slln = new SinglyLinkedListNode(data);
        if(llist==null){
            return slln;
        }
        else{
            slln.next=llist;
            llist=slln;
            return llist;
        }
    }

