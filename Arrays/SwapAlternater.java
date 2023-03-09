package Arrays;

public class SwapAlternater {
    

    public static void swapAlternate(int arr[]) {
    	//Your code goes here
        
        int i = 0, j = 1;
        while( i < arr.length && j < arr.length){

                 int c = arr[i];
                 arr[i] = arr[j];
                 arr[j] = c;
                 i += 2;
                 j += 2;
        }
    }
}
