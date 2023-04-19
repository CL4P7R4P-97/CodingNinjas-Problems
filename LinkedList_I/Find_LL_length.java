package LinkedList_I;


class LinkedListNode<T>{

    T data;
    LinkedListNode<T> next ;
    LinkedListNode<T> node;
 
    LinkedListNode(T data){

        this.data = data;
    }
    
}

public class Find_LL_length {
    

    public static int length(LinkedListNode<Integer> head){
		
		int len  =0;
		while(head != null){
 
              len++;
               head  = head.next;
		}

return len;
	}
}
