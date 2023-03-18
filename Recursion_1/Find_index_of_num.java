package Recursion_1;

public class Find_index_of_num {
    
    public static int finder(int arr[] , int index, int x){

		if( index >= arr.length){
			return -1;
		}
		if(arr[index] == x){
			return index;
		}

		return finder(arr, index+1, x);
	}

	public static int firstIndex(int arr[], int x) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
      return finder(arr, 0, x);
		
	}
}
