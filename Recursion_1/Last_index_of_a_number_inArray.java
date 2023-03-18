package Recursion_1;
public class Last_index_of_a_number_inArray {
    

    public static int finder(int arr[] , int index, int x){

		if( index < 0){
			return -1;
		}
		if(arr[index] == x){
			return index;
		}

		return finder(arr, index-1, x);
	}

	public static int lastIndex(int arr[], int x) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
        return finder(arr, arr.length -1 ,  x);
		
	}
}
