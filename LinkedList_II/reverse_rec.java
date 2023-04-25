package LinkedList_II;

public class reverse_rec {


    public static LinkedListNode<Integer> reverseLinkedListRec(LinkedListNode<Integer> head) {
		//Your code goes here
        if(head ==null || head.next == null){
            return head;
        }

        LinkedListNode<Integer> prev = reverseLinkedListRec(head.next);
        System.out.println(head.data);
       head.next.next =  head;
       head.next   = null;
        return prev;
       
        
	}


    public static void main(String[] args) {
        
        LinkedListNode<Integer> head = printLL.createLL();
        
        printLL.printLL_rec(reverseLinkedListRec(head));
    }
    
}
