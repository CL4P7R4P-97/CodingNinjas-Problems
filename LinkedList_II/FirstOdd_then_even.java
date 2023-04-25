package LinkedList_II;

public class FirstOdd_then_even {

    public static LinkedListNode<Integer> evenAfterOdd(LinkedListNode<Integer> head) {
        
        if(head == null || head.next == null){
            return head;
        }
 LinkedListNode<Integer> tHead = head, oddH= null, evenH = null, t1 = null, t2 = null;

 
   while(head != null){

        if(head.data.intValue() % 2 == 1){

            if(oddH == null){

                oddH = head;
                t1 = oddH;
                head = head.next;
            }

            else{

                t1.next = head;
                t1 = head;
                head = head.next;
            }
        }
        
        else{

            if(evenH == null){

                evenH = head;
                t2 = head;
                head = head.next;
            }

            else{
                t2.next = head;
                t2 = head;
                head = head.next;
            }
        }


   }

   if(oddH  == null || evenH == null){
       return tHead;
   }

   t1.next = evenH;
   t2.next = null;
   return oddH;
    
      
      
}
    
}
