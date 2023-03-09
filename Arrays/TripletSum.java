package Arrays;

import java.util.Arrays;

public class TripletSum {


    public static int findPair(int arr[], int x, int index){


        

        int i= index;
        int count = 0;
        while(i < arr.length){

            int j = arr.length-1;

            while(j > i){

               if(arr[i] + arr[j] == x){
              
                    count+=1;

               }
               if(arr[i] + arr[j] < x){
                   break;
               }

               j--;

            }
            i++;
        }

            return count;
    }
    
    public static int findTriplet(int[] arr, int x) {
    	//Your code goes here
        
        int i  = 0;
        int total = 0;
        Arrays.sort(arr);

        while(i < arr.length){

              total +=  findPair(arr, x-arr[i], i+1);
               i++;
        }
        return total;
    }

    
}
