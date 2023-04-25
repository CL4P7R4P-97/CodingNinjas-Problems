package LinkedList_II;
  
import java.util.ArrayList;

public class kReverse {

    
    public static ArrayList<LinkedListNode<Integer>> reverse(LinkedListNode<Integer> head){

        ArrayList<LinkedListNode<Integer>> group = new ArrayList<LinkedListNode<Integer>>();
        
        
                if(head == null || head.next == null){
                    group.add(head);
                    group.add(head);
                    return group;
                }
         
                LinkedListNode<Integer> temp = head, prev = null, tHead = head;
                
                while( head != null ){
        
                    temp = temp.next;
                    head.next = prev;
                    prev = head;
                    head = temp;
        
                }
         
                 group.add(prev);
                 group.add(tHead);
        
                 return group;
        
            }
        
            public static LinkedListNode<Integer> kReverser(LinkedListNode<Integer> head, int k) {
                //Your code goes here\
        
                if(head == null || head.next == null || k ==0){
        
                    return head;
                }
                   
                   int count  = 1;
                  LinkedListNode<Integer> temp = head, nexter = null, retNode = null;
                  ArrayList<LinkedListNode<Integer>> rev = null;
                   while(count != k && temp != null){
        
                       count++;
                       temp = temp.next;
                   }
                   
                  if(temp == null){
        
                      nexter = null;
                  }
                  else{
                       nexter = temp.next;
                   temp.next = null;
                  }
        
                rev = reverse(head);
                retNode = kReverser(nexter, k);
                rev.get(1).next = retNode;
                 return rev.get(0);
        
            }
    
}
