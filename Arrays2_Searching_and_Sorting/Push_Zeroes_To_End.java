package Arrays2_Searching_and_Sorting;

public class Push_Zeroes_To_End {


    public static void rotate(int[] arr, int d) {
     
        int i = 0;
        int m = 0;
   
        while(m < d){
   
                 int num = arr[i];
                while( i < arr.length){
   
              arr[i] = arr[i+1];
              i++;
   
        }
        arr[arr.length-1] = num;
        i = 0;
        m++;
   
        }
           
       }
    
}
