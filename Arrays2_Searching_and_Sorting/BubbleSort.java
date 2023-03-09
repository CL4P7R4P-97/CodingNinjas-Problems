package Arrays2_Searching_and_Sorting;

public class BubbleSort {

    public static void bubbleSort(int[] arr){
    	//Your code goes here
        
        int i = 0 ; 
        while(i < arr.length){


         int j = 1;
         int k = 0;
            while(j < arr.length-i){


                     if(arr[k] > arr[j]){
                         int c = arr[k];
                         arr[k] = arr[j];
                         arr[j] = c;
                         
                     }
k++;
 j++;

            }
             i++;
           
        }
    }  

}
    

