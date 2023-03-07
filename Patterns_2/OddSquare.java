package Patterns_2;

import java.util.Scanner;

public class OddSquare {
    

    public static void main(String[] args) {
        

        
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int i =0 ;

        while( i< n){


            int j = i, t = 0;
            while( t< (n-i) ){

                System.out.print(2*j+1);
                j++;
                t++;
            }

            int k = 0, m = 0;
            while(k<i && m<i){

                System.out.print(2*k+1);
                k++;
                m++;
            }

            System.out.println("");
           i++;
           s.close();
        }


      
    }
}
