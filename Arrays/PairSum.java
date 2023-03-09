package Arrays;

import java.util.Arrays;

public class PairSum {

    public static int pairSum(int arr[], int x) {
    	//Your code goes here
        Arrays.sort(arr);
     int pairs = 0;
     int i = 0;
        while( i < arr.length){

            int j= arr.length-1;

            while(j > i){

                if(arr[i] + arr[j] == x){

                    //  System.out.println(arr[i] +  " " +  arr[j]);
                      pairs += 1;
                }

                if(arr[i] + arr[j] < x){
                    break;
                }
                j--;
            }

            i++;
        }

        return pairs;
    }
    
}
