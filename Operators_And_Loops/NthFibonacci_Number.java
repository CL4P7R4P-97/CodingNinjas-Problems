
package Operators_And_Loops;
import java.util.Scanner;


/**
 * NthFibonacci_Number
 */
public class NthFibonacci_Number {

    public static int fibo(int n) {
        
        int a = 0, b = 1, c = 0;
        if(n == 1){
            return a ;
        }
        if(n == 2){
            return b;
        }

        int i = 3;
        for( ;i <= n; i++){

             
            c = a+b;
            a = b;
            b = c;

        }
        return c;
    }
    
    public static void main(String[] args) {
        

        Scanner s = new Scanner(System.in);
         int n = s.nextInt();


         System.out.println(fibo(n));
         s.close();
    }
}