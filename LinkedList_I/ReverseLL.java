package LinkedList_I;

public class ReverseLL {


    public static LinkedListNode<Integer> reverseLL_noRecursion(LinkedListNode<Integer> head){


		if(head == null){
			return head;
		}

		LinkedListNode<Integer> temp = null, prev = null;

		while(head != null){

		 

				temp = head.next;
				head.next = prev;
				prev = head;
				head = temp;
	 
		}

		return prev;
	}

    public static void printReverse_recursion(LinkedListNode<Integer> head) {
	 
 
        if(head == null){
            return;
        }
        
        printReverse_recursion(head.next);
        System.out.print(head.data +  " ");
        return;
        }
 
    
}
