package Arrays2_Searching_and_Sorting;

public class SelectionSort {



    public static void selectionSort(int[] arr) {
    	//Your code goes here
       
       int i = 0, minIndex  = -1;

       while( i < arr.length){


              int j = i+1;
               
              while( j < arr.length){

                  
                   if(arr[i] > arr[j]){

                      
                      if(minIndex != -1){

                          if(arr[minIndex] > arr[j]){
                              
                              minIndex = j;
                          }
                         
                      }
                       else{

                              minIndex = j;
                          }


                   }
               j++;
              }

              if(minIndex != -1){


                  int c = arr[i] ;
                  arr[i] = arr[minIndex];
                  arr[minIndex] = c;
              }
              i++;
              minIndex = -1;

       }



    }   
    
}
