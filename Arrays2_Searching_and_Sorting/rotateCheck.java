package Arrays2_Searching_and_Sorting;

public class rotateCheck {

    public static int arrayRotateCheck(int[] arr){
    	//Your code goes here
    

        if(arr.length == 0){
            return 0;
        }
        

      int i = 0;
       int minIndex = -1,  min = Integer.MAX_VALUE;

       while( i < arr.length){

           if(arr[i] < min ){

                 minIndex = i;
                 min = arr[i];
                
           }

           i++;
            
       }

return minIndex;
    }
    
}
