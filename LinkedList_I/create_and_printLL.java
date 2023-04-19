package LinkedList_I;

import java.util.Scanner;

class Node<T>{

    T data;
    Node<T> next;

    Node(T data){

        this.data = data;
    }
}

public class create_and_printLL {

    public static Node<Integer> createLL(){

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the lenght of the linked list");
        int len = s.nextInt();
        int i = 0; 
        Node<Integer> head = null, curr = null;
        while(i < len){
            
            Node<Integer> n  = new Node<>(s.nextInt());
            if(head == null){
                head = n;
                curr = head;
            }
            
               curr.next = n;
               curr = n;
            i++;
        }
        s.close();
        return head;
    } 


    public static void printLL(Node<Integer> head){

             while( head != null){


                System.out.print(head.data+ " ");
                head = head.next;
             }
    }

public static void main(String[]args){

   Node<Integer> head =  createLL();
       printLL(head);
}

    
}
