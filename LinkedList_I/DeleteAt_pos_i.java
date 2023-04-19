package LinkedList_I;

public class DeleteAt_pos_i {
    

    public static LinkedListNode<Integer> deleteNode(LinkedListNode<Integer> head, int pos) {
		// Write your code here.
		
         
        int count = 0;
		LinkedListNode<Integer> temp = null;

		LinkedListNode<Integer>  h = head;

		while(head != null){

			if(count == pos){

				if(temp == null){

					h = head.next;
					break;
				}
				else if(head.next == null){
					temp.next = null;
					break;
				}
				temp.next = head.next;
				break;
			}

			count++;
			temp  = head;
			head = head.next;
		}


return h;
	}
}
