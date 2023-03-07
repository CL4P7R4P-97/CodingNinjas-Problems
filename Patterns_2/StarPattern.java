package Patterns_2;

import java.util.Scanner;

public class StarPattern {


    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        int i = 0;
        while( i<n ){

            int j= 0;
            while( j<(n-i-1) )
            {
                System.out.print(" ");
                j++;
            }

            int k  =0;
            while( k < (2*i + 1)){
                System.out.print("* ");
                k++;
            }
            System.out.println("");
            i++;
        }
        s.close();

    }

     
    
}
