package Functions_And_Scope;

import java.util.Scanner;

public class Fibonacci_Number {
    

    public static void check(int n){

        int a = 0, b = 1;

         if( n == a || n == b){
            System.out.println(true);
            return;
         }

         while( b <= n){

            
            int c = a+b;
            a = b;
            b = c;
            // System.out.println(b);
            if(b == n){
                System.err.println(true);
                return;
            }

         }

         System.out.println(false);
    }

    public static void main(String[] args) {
        

        Scanner s = new Scanner(System.in);
        
        int num = s.nextInt();


        check(num);
    }
}
