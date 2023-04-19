package LinkedList_I;

public class findElementPos {

    public static int findNode(LinkedListNode<Integer> head, int n) {
		// Write your code here.
        
      int pos = -1, count  = 0;
	  while(head != null){

		  if(head.data == n){
			  pos = count;
			return pos;
		  }
		  count++;
		  head = head.next;
	  }

	  return pos;
        
	}
    
}
