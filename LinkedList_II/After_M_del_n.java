package LinkedList_II;

public class After_M_del_n {

    public static LinkedListNode<Integer> skipMdeleteN(LinkedListNode<Integer> head, int M, int N) {
		//Your code goes here

        if(head == null || N == 0){

            return head;
        }
        if( M == 0 && N >=1){
            return null;
        }
        
        LinkedListNode<Integer> th = head, temp = null;
        int ret = M, rem = N;

        while(head != null){

          
              ret--;
            
            if(ret < 0 && rem != 0){
          
        //    System.out.println("inside");
          rem-- ;
        //    System.out.println(head.data + " Skipping");
          head = head.next;
         
          continue;

            }
        

            if(ret < 0){
                ret = M;
                ret--;
            }
            if(rem == 0){
                rem = N;
            }
           
                  if(temp!= null){
                      temp.next = head;
                  }
            temp  = head;
            head = head.next;
          
          
        }
         
 if(temp.next != null){
                      temp.next = null;
                  }
        return th;
	}
    
}
