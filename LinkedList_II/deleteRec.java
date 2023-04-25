package LinkedList_II;

  

public class deleteRec {

    public static LinkedListNode<Integer> delete(LinkedListNode<Integer> head, int pos){

        if(head == null){
            return null;
        }

        if(pos == 0 && head.next == null){

            return null;
        }

        if(pos == 0){
          
            return head.next;

        }

        LinkedListNode<Integer> next = delete(head.next, pos-1);
        head.next = next ;
        return head;
    }


    public static void main(String[] args) {
        
        LinkedListNode<Integer> head = printLL.createLL();
        printLL.printLL_rec(delete(head, 0));
    }
    
}
