package Operators_And_Loops;

import java.util.Scanner;

public class TermsOfAP {
    

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);

        int  n = s.nextInt();

        int i =1;
        int j = 1;
        while( j <= n){


            if( (3*i + 2) % 4  != 0){

                System.out.println(3*i+2);
                j++;
            }
            i++;
        }
        s.close();
        
    }
}
