package Tests.Test2;

import java.util.Scanner;

public class MaximumNumber {


    public static void main(String[] args) {
        

        Scanner s = new Scanner(System.in);


        int  num = s.nextInt();

        s.close();

            int genNum = 0,  mul = 1, div = 10, rem = 0, prem= 0, max = Integer.MIN_VALUE, n = num;
     
        while( n != 0){


         rem = num % div;
           n = num / div;
        
         
          
         genNum = n * mul + prem;
        //  System.out.println(genNum);
         if(genNum > max){
            max = genNum;
         }
         prem = rem;
         div *= 10;
         mul *= 10;


        }
        System.out.println(max);
    }
    
}
