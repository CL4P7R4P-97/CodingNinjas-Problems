package Operators_And_Loops;

import java.util.Scanner;

public class DecimalToBinary {
    

    public static void main(String[] args) {
        

        Scanner s = new Scanner(System.in);
        boolean first = true;
        int num = s.nextInt();
         int binarY = 0;

         if(num % 2 == 0){
            first = false;
         }

        while( num != 0){

            int rem = num % 2;
           
            num = num / 2;

            binarY = binarY * 10 + rem;
        }

        if(!first){
           
             
             binarY = binarY * 10;
        }
        

         System.out.println(binarY);

        s.close();
    }
}
