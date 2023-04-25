package LinkedList_I;

public class appendLastN_to_first{

    public static LinkedListNode<Integer> appendLastNToFirst(LinkedListNode<Integer> head, int n) {
		//Your code goes here

    if(head == null){
        return head;
    }

      int count = 0;
      if(n == 0){
          return head;
      }

    LinkedListNode<Integer> tail = null;
     LinkedListNode<Integer> tempHead = head;
      LinkedListNode<Integer>  newHead = null;
    while(head != null){

        count++;
        tail = head;
        head = head.next;
    }
     
    int stopAt = count - n;
    tail.next = tempHead;
    count = 0;
    if(stopAt == 0){
        return null ;
    }
    while( count != stopAt){

        count++;
        if(count == stopAt){
            break;
        }
        tempHead  = tempHead.next;
    }

    newHead = tempHead.next;
    tempHead.next = null;

return newHead;
}

}