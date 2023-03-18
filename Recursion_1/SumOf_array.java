package Recursion_1;
public class SumOf_array {
    
    
	public static int  summar(int arr[], int index){

		if(index < 0){
			return 0;
		}
		if(index == 0){
			return arr[index];
		}

		return arr[index] + summar(arr, index-1);
	}

	public static int sum(int arr[]) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
		return summar(arr, arr.length-1);
	}
}
