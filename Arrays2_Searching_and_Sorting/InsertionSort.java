package Arrays2_Searching_and_Sorting;

public class InsertionSort {
    

    public static void insertionSort(int[] arr) {
    	//Your code goes here

       int i = 0;
       int j = 1;

       while( j < arr.length){


            if(arr[i] > arr[j] )
            {
                int k =i;
                int num = arr[j];
                while( k != -1 && arr[k] > num){

                    arr[k+1] = arr[k];
                    k--;
                }

                arr[k+1] = num;
                i++;
            }

            else{

                i++;
            }
                     j++;
       }

}
}
