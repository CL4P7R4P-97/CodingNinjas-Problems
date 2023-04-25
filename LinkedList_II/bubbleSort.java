package LinkedList_II;

public class bubbleSort {

    
public static int findLength(LinkedListNode<Integer> head){

	if(head == null){
		return 0;
	}
    int count = 0;

	while(head != null){

		count++;
		head = head.next;
	}

	return count;
}
	public static LinkedListNode<Integer> bubbleSort(LinkedListNode<Integer> head) {
		//Your code goes here
	
	if(head == null || head.next == null){

		return head;
	}

  
     LinkedListNode<Integer>fP = head, prev = null, mH = head, sP = head.next, nexter = null;
     boolean fLoop = true;
	int len = findLength(head);

	int i = 0;
	int k = 0;
	while(i < len ){


// System.out.println("i: " +   i );
           while(sP != null){
 
        //    System.out.println("k: " + k + "Head: " + mH.data  );
		     
			   
		if( fP.data.intValue() > sP.data.intValue() ){

             nexter  = sP.next;
			 sP.next = fP;
			 
			 fP.next = nexter;
             nexter = fP;
			 fP = sP;
			 sP = nexter;
			 if(prev == null){
				 prev = fP;
			 }
			 else{
				 prev.next = fP;
			 }
			//  System.out.println("k: " + k + " " + fP.data.intValue()+ " " +   sP.data.intValue() );
			if(k == 0 && mH.data.intValue() !=  fP.data.intValue() ){

				mH = fP;

				// System.out.println("changed" + mH.data  + " "  + i);
			}		 
		}
		// System.out.println("k: " + k );
		 k++;
		// System.out.println(fP.data);
		prev = fP;
		fP = fP.next;
		sP = sP.next;

		   }
   k = 0;
   prev = null;
    i++;
	// System.out.println("i : "  + i);
	fP = mH;
	sP = mH.next;
	}
	
	
	return mH;
	}
    
}
