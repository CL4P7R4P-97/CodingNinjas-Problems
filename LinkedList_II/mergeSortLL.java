package LinkedList_II;

public class mergeSortLL {


    public static LinkedListNode<Integer> findMid(LinkedListNode<Integer> head){


        if(head == null || head.next == null){

            return head;
        }

         LinkedListNode<Integer> fast = head;
         LinkedListNode<Integer> slow = head;

         while( fast.next != null && fast.next.next != null){

             slow = slow.next;
             fast = fast.next.next;
         }

         return slow;
    }


    public static LinkedListNode<Integer> merge(LinkedListNode<Integer> h1, LinkedListNode<Integer>h2){


        if(h1 == null){

            return h2;
        }

        if(h2 == null){

            return h1;
        }

        LinkedListNode<Integer> mHead = null, temp = null;

        while(h1 != null && h2 != null){

            if(h1.data.intValue() <= h2.data.intValue()){


                if(mHead == null){

                    mHead = h1;
                    temp = mHead;
                    h1 = h1.next;
                }
                else{

                    temp.next = h1;
                    temp = h1;
                    h1 = h1.next;
                }
            }

            else{

                 if(mHead == null){

                    mHead = h2;
                    temp = mHead;
                    h2 = h2.next;
                }
                else{

                    temp.next = h2;
                    temp = h2;
                    h2 = h2.next;
                }
            }
        }
   
   
    if(h1 == null){

        while(h2 != null){

            temp.next = h2;
            temp = h2;
            h2 = h2.next;
        }
    }

    if(h2 == null){

        while(h1 != null){

            temp.next = h1;
            temp = h1;
            h1 = h1.next;
        }
    }

    return mHead;
   
   
    }

	public static LinkedListNode<Integer> mergeSort(LinkedListNode<Integer> head) {
		//Your code goes here
	if(head == null || head.next == null ){
        return head;
    }

    LinkedListNode<Integer> mid = findMid(head);
    LinkedListNode<Integer> second = mid.next;
    mid.next = null;

    LinkedListNode <Integer>h1 = mergeSort(head);
    LinkedListNode<Integer>h2 = mergeSort(second);

   return merge(h1,h2);
    
    
    }
    
}
