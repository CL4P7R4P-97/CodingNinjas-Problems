package Recursion_2;

public class MergeSort {

    public static int[] merger(int arr1[], int arr2[]){


		if(arr1.length == 0){
			return arr2;
		}
		if(arr2.length == 0){
			return arr1;
		}

           int arr3[] = new int[arr1.length + arr2.length];
           int i  =0, j = 0, k = 0;
		   while(k < arr3.length){

			   if(i < arr1.length){

				   if(j < arr2.length){

					   if(arr1[i] <=   arr2[j] ){

						   arr3[k++] = arr1[i++];

					   }
					   else{

						   arr3[k++] = arr2[j++];
					   }
				   }
				   else{

					    while( i < arr1.length ){

					   arr3[k++] = arr1[i++];
				   }

				   }

			   }

			   else{

				   while( j < arr2.length ){

					   arr3[k++] = arr2[j++];
				   }
			   }

		   }


		   return arr3;
		   
		 
	}
	public static void mergeSort(int[] input){
		// Write your code here
		if(input.length == 0 || input.length == 1){

			return;
		}

		int mid  = input.length /2;
		int arr1[] = new int[mid];
		int arr2[] = new int[input.length-mid];

		int i = 0;
		while( i< mid){
			arr1[i] = input[i];
			i++;
		}
        int j = 0;
		while(i < input.length){
			arr2[j++] = input[i];
			i++;
		}
			mergeSort(arr1);
			mergeSort(arr2);

			int sorted[] = merger(arr1, arr2);
			i = 0;
			while( i< input.length){

				input[i] = sorted[i];
				i++;
			}
			return;
		}
    
}
