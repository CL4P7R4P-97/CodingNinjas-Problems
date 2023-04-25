package LinkedList_II;

import java.util.Scanner;

 

class LinkedListNode<T> {

    T data;
    LinkedListNode<T> next;

    LinkedListNode(T data){

        this.data = data;

    }
}

public class printLL {


    public static void printLL_rec(LinkedListNode<Integer> head){


        if(head == null){
            return;
        }

        System.out.print(head.data + " ");
        printLL_rec(head.next);
    }

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
    

    public static void main(String []args){

        LinkedListNode<Integer> head = createLL();
        printLL_rec(head);
    }
}
