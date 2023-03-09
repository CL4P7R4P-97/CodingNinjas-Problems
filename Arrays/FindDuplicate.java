package Arrays;
import java.util.Arrays;
public class FindDuplicate {
    

    public static int duplicateNumber(int arr[]) {
    	//Your code goes here
       int i = 0;
       Arrays.sort(arr);
       int result = 0;
       while (i < arr.length){

           
           if(arr[i] != i){
              result = arr[i];
              break;
           }
           i++;
       }
       return result;
    }

}
