package LinkedList_II;

import java.util.Scanner;

public class InsertRecursiveLL {

    public static LinkedListNode<Integer>  createLL(){

        Scanner  s = new Scanner(System.in);
        LinkedListNode<Integer> head = null, mHead = null;
        int a = s.nextInt();
        while( a!= -1){

            LinkedListNode<Integer> n = new LinkedListNode<>(a);
            if(head == null){
                head = n;
                mHead = n;
            }
            else{

                head.next = n;
                head = n;
            }

            a = s.nextInt();
        }
 
        s.close();
        return mHead;
    }

    public static LinkedListNode<Integer> insert(LinkedListNode<Integer> head, int data, int pos){

          
        if(head == null){
            return null;
        }

        if(pos == 0 && head != null){

            LinkedListNode<Integer> n = new LinkedListNode<>(data);
            n.next = head;
            return n;
        }

        if(pos == 0 && head == null){

            LinkedListNode<Integer> n = new LinkedListNode<>(data);
            n.next = null;
             return n;
        }

        LinkedListNode<Integer> next =  insert(head.next, data, pos-1);
        head.next = next ;
        return head;

    }
    
    public static void main(String[] args) {
        
        LinkedListNode<Integer> head = createLL();
        head = insert(head, 20, 0);
        printLL.printLL_rec(head);
    }
    
}
