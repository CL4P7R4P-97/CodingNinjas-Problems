package Arrays;

public class ArrangeNumberInArray {
    

    public static void arrange(int[] arr, int n) {
    	//Your code goes here
     
     int i = 1, j = 0, k = arr.length-1;

        while( j <= k){

            if(i % 2 == 0){
                arr[k--] = i;
            }
            else{
                arr[j++] = i;
            }
            i++;
        }
    }
}
