package Arrays;

public class Sort_0_1_2 {

    public static void sort012(int[] arr){
    
        int i  = 0;
        int nz = 0;
        int nt = arr.length -1;

        while( i <= nt ){

            if(arr[i] == 0){

                 
                    arr[i] = arr[nz];
                    arr[nz]  = 0;
                    nz++;
                  i++;
            }

           else if(arr[i] == 2){

               
               arr[i]  = arr[nt];
               arr[nt] = 2;
              nt--;
               
            }
            else{
                i++;

            }
           
        }
    
        
    }

    
}
