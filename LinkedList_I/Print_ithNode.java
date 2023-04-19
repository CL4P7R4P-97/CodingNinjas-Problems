package LinkedList_I;

public class Print_ithNode {


    public static void printIthNode(LinkedListNode<Integer> head, int i){
        
        int count = 0;
		//Your code goes here
		while(head != null){
          
		  
		  if(count == i){
			  System.out.println(head.data);
			 
		  }
		   count++;
		  head = head.next;

		}
       
	}
    
}
