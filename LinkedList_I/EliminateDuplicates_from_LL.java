package LinkedList_I;

public class EliminateDuplicates_from_LL {


    public static LinkedListNode<Integer> removeDuplicates(LinkedListNode<Integer> head) {
        //Your code goes here
       if(head == null){
           return head;
       }

       LinkedListNode<Integer>prev = head, temp = head.next;
       while(temp != null){

           if( !(prev.data.equals(temp.data) )  ){

               prev.next = temp;
               prev = temp;
           }
           temp = temp.next;
       }

       prev.next = temp;
return head;


    }

    
}
