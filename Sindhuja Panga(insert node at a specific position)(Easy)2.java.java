

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
        int n=0;
          if (head == null)
           n=1;
        SinglyLinkedListNode temp = new SinglyLinkedListNode(data);
        if(position==0)
        n=2;
        switch(n)
        {
            case 1:
                return null;
            case 2: 
            temp.next = head;
            return temp;
        }
    
     SinglyLinkedListNode p = head;
        int i=0;
        while(i< position-1)
         {
            p= p.next;
            i++;
        }
        SinglyLinkedListNode next = p.next;
        p.next = temp;
        temp.next = next;
        return head;

    }

