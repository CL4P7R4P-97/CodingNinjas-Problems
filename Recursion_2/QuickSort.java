package Recursion_2;

public class QuickSort {

    public static void print(int arr[]){

        int i =0;
                 while( i < arr.length){
                     System.out.print(arr[i] + " ");
                     i++;
                 }
        
             }
        
        
            public static int findPivot(int arr[], int si, int ei){
         
                
        
                int count = 0;
                int pivotEle = arr[si];
                int i = si+1;
                // System.out.println("counting");
                while( i <= ei){
        
                    if(arr[i] < pivotEle){
        
                        count++;
                    }
        
                    i++;
                }
        
                // Placing element at right place;
                int pivotIndex  = si+count;
                int c = arr[si+count];
                arr[si+count] = pivotEle;
                arr[si] = c;
        
                // Sorting around pivot element
                // System.out.println(pivotEle + " " + " at " + pivotIndex);
        
                int j = si;
                int k = ei;
        
                while(j < pivotIndex ){
        
                    if( arr[j] <  pivotEle )
                    {
                       j++;
                    }
                    else if(arr[k] >= pivotEle){
                        k--;
                    }
                    
                    else{
                        int z = arr[j];
                    arr[j] = arr[k];
                    arr[k] = z;
        
                    }
        
                   
                }
        
         return pivotIndex;
        
             
            }
        
        
        
                public static void quickSortHelper(int arr[], int si, int ei){
        
        // System.out.println("For: " + si + " " + ei);
        
                    if(si >= ei || ei >= arr.length){
                        return ;
                    }
        
        //  System.out.println("finding pivot soon");
                 
              int pivot = findPivot(arr, si, ei);
        
        // System.out.println("found pivot at " + pivot);
            //    print(arr);
              quickSortHelper(arr,si, pivot-1);
              quickSortHelper(arr,pivot+1, ei);
                
        
                
            }
            
            public static void quickSort(int[] input) {
                /* Your class should be named Solution
                 * Don't write main().
                 * Don't read input, it is passed as function argument.
                 * No need to print or return the output.
                 * Taking input and printing output is handled automatically.
                 */
                 if(input.length == 0 || input.length == 1){
                     
                     return ;
                 }
        
                quickSortHelper(input,0,input.length-1);
        
            }
        
    
}
