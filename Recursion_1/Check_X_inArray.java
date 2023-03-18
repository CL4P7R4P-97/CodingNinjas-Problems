package Recursion_1;

public class Check_X_inArray {
    

    public static boolean check(int arr[], int index, int x){

		if(index < 0){
			return false;
		}
		if(arr[index ] == x){
			return true;
		}

		return check(arr, index-1, x);
	}
	
	public static boolean checkNumber(int arr[], int x) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
     
		return check(arr, arr.length-1, x);
	}
}
