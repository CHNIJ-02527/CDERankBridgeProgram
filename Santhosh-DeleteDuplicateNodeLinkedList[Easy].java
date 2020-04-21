package com.cts.bridgeprogram.ds;



// Complete the removeDuplicates function below.

/*
 * For your reference:
 *
 * SinglyLinkedListNode {
 *     int data;
 *     SinglyLinkedListNode next;
 * }
 *
 */
static SinglyLinkedListNode removeDuplicates(SinglyLinkedListNode head) {
if(head==null){
    return null;
}
SinglyLinkedListNode temp=head.next;
SinglyLinkedListNode prev=head;
while(temp!=null)
    {
     if(prev.data==temp.data)
         {
         prev.next=temp.next;
         temp.next=null;
         temp=prev.next;
     }
    else
        {
          prev=temp;
          temp=temp.next;
    
    }
}
return head;
}


