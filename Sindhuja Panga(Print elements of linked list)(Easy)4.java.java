

    // Complete the printLinkedList function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static void printLinkedList(SinglyLinkedListNode head) {
          if(head != null)
        {
            SinglyLinkedListNode temp;
            temp = head;
            
            while(temp != null){
                System.out.println(temp.data);
                
                temp = temp.next;
            }
        }
    }




