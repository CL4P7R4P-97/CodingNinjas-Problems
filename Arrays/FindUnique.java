package Arrays;

public class FindUnique {
    


    public static int findUnique(int[] arr){
		//Your code goes here
       
        byte sizE = 4;
        int countBit[] =  new int[sizE*8];
        int i = 0;
        while( i< countBit.length){
            int count = 0;
            int j =0;
            while(j < arr.length){

                     if( (arr[j] & (1<<i) ) != 0 ){

                         count += 1;
                     }
                
                j++;
            }
            countBit[i] = count;
            i++;
        }

       i = 0;
       int res = 0;
        while(i < countBit.length){


         res += ((countBit[i] % 2) * (1<<i));

        i++;
        }
       return res;
    }

}
