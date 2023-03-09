package Arrays2_Searching_and_Sorting;

public class BinarySearch {
    

    public static void sortZeroesAndOne(int[] arr) {
        //Your code goes here
        

        int i =0;
        int j = 1;

       while( j < arr.length){

            if(arr[j] == 0){

                while(i < j){

                 if(arr[i]  == 1){
                        arr[i] = 0;
                    arr[j] = 1;
                    i++;
                  
                   break;
                 }
                 
                 i++;
                    
                }
               

            }
      
                  
                j++;
        }

    }
}
