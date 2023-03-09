package Arrays2_Searching_and_Sorting;

public class Merge_2_sorted_Arrays {

    public static int[] merge(int arr1[], int arr2[]) {
    	//Your code goes here

        if(arr1.length == 0){
            return arr2;
        }
        if(arr2.length == 0){
            return arr1;
        }
        
       int arr3[] = new int[arr1.length + arr2.length];

     int k = 0;
     int i = 0, j =0;
     while( k < arr3.length){

 
            if(arr1[i] <= arr2[j]){

                 arr3[k++] = arr1[i++];

            }
            else{

                arr3[k++] = arr2[j++];
            }

            if( i == arr1.length){

                while( j< arr2.length){

                    arr3[k++] = arr2[j++];
                }
            }

            if(j == arr2.length){

                while(i < arr1.length){

                    arr3[k++] = arr1[i++];
                }
            }
     
               
     }
         return arr3;
}
    
}
