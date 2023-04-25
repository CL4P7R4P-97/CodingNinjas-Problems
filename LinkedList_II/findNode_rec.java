package LinkedList_II;

public class findNode_rec {

    public static int findNodeRec(LinkedListNode<Integer> head, int n) {
    	//Your code goes here
       if(head == null)
     {
           return -1;
     }
	
     if(head.data.intValue() == n){
         return 0;
     }


    if(head.next == null){
        return -1;
    }

    int result = findNodeRec(head.next, n);
    if(result == -1){
        return result;
    }
    // System.out.println(result);
    return ++result;

}
    
}
