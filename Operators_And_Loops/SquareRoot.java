package Operators_And_Loops;

import java.util.Scanner;

public class SquareRoot {
    

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);

        int  n = s.nextInt();
        s.close();
        
        int i = n/2;
        while( i > 1 )
        {

            if( n % (i*i) == 0){
                System.out.println(i);
                return;
            }
            i--;
        }
        
    }
}
