package Recursion_2;

public class BinarySearch_recursive {

    public static int binSearch(int s, int e, int x, int arr[]){

        if(s > e){
            return -1;
        }

        int mid = (s+e)/2;

        if(arr[mid] == x){
            // System.out.println(mid);
            return mid;
        }
        if(arr[mid] < x){
            // System.out.println("s to R");
            s = mid+1;
        }
        else{
            //  System.out.println("e to L");
           e= mid-1;
        }
        //   System.out.println(s + " " + e);
        return binSearch(s, e, x, arr);
    }

    
}
