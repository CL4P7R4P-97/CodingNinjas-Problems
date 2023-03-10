package Arrays2_Searching_and_Sorting;

public class Second_max {


    public static int secondLargestElement(int[] arr) {
        //Your code goes here
       int max = Integer.MIN_VALUE, smax = Integer.MAX_VALUE;


       if(arr.length == 0){

           return max;
       }

      int i = 0; 
      while( i< arr.length){


          if(arr[i] > max){

              smax = max;
              max = arr[i];
              
          }
          if(arr[i] > smax && arr[i] < max){
              smax = arr[i];
          }
          i++;
      }

      return smax;
       
    }

    
}
