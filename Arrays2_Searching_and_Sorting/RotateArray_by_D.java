package Arrays2_Searching_and_Sorting;

public class RotateArray_by_D {

    public static void Naive_rotate(int[] arr, int d) {
     
        int i = 0;
        int m = 0;
   
        while(m < d){
   
                 int num = arr[i];
                while( i < arr.length -1){
   
              arr[i] = arr[i+1];
              i++;
   
        }
         arr[arr.length-1] = num;
        i = 0;
        m++;
   
        }
           
       }



       /////////////////////////////////////////////////////////////////////////

       public static void reverse(int arr[], int s, int e){
        

        
        while( s< e){
        
        int c = arr[e];
        arr[e--] = arr[s];
        arr[s++] = c;

        }
        // print(arr);
    }

public static void print(int arr[]){

    int i =0;
    while(i < arr.length){

        System.out.print(arr[i] + " ");
        i++;
    }
    System.out.println("");
}

    public static void best_rotate(int[] arr, int d) {
     
     reverse(arr , 0, arr.length- 1);
     reverse(arr, 0, arr.length - d -1);
     reverse(arr, arr.length -d, arr.length -1);
        // print(arr);
    }

    
}
