package LinkedList_I;

public class isLL_Palindrome {

    public static LinkedListNode<Integer> findMidPoint(LinkedListNode<Integer> head){

        LinkedListNode<Integer>fast = head;
        LinkedListNode<Integer> slow = head;
          
            while( fast.next != null && fast.next.next != null){
         
                  slow = slow.next ;
                  fast = fast.next.next;
        
            }
            LinkedListNode<Integer> temp = slow.next;
            slow.next = null;
            return temp;
            
        
        
            }
        
        
            public static LinkedListNode<Integer> reverseLL(LinkedListNode<Integer> head){
        
              if(head == null || head.next == null){
                  return head;
              }
        
                LinkedListNode<Integer> temp = null;
                LinkedListNode<Integer>prev =  null;
        
                while(head != null){
        
                    temp = head.next;
                    head.next = prev;
                    prev = head;
                    head = temp;
                }
        
                return prev;
            }
        
            public static boolean isPalindrome(LinkedListNode<Integer> head) {
        
                if(head == null || head.next == null ){
                    return true;
                }
            
                //Your code goes here
               LinkedListNode<Integer> mid = findMidPoint(head);
               LinkedListNode<Integer> sHead = reverseLL(mid);
               while(sHead != null){
                   if(sHead.data != head.data){
                       return false;
                   }
                   sHead = sHead.next;
                   head   = head.next;
               }
               return true;
            }
    
}
