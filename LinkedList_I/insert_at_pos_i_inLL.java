package LinkedList_I;

public class insert_at_pos_i_inLL {
    public static LinkedListNode<Integer> insert(LinkedListNode<Integer> head, int pos, int data){
        //Your code goes here

        int index = 0;
        LinkedListNode<Integer> h = head;
        LinkedListNode<Integer> prev = null;
        while( head != null){

            if(index == pos ){

                
                LinkedListNode<Integer> n = new LinkedListNode<>(data);
                
               if(prev == null){
                   n.next = head;
                   head = n;
                   h = head;
               }
               else{
                    n.next = head;
                prev.next = n;
               }
              
                break;
            }
            index++;
            prev = head;
            head  =head.next;
        }

        if(index == pos && head == null){
             LinkedListNode<Integer> n = new LinkedListNode<>(data);
             prev.next = n;

        }
    
    return h;

    }
    
}
