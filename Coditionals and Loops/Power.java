
import java.util.*;
public class Power {


   /**
 * @param args
 */
public static void main(String []args){

    Scanner s = new Scanner(System.in);
    int x = s.nextInt();
    
    int n = s.nextInt();


    if(n == 0){
        System.out.println( 1);
        s.close();
        return ;
    }

    if(n ==1){
        System.out.println(x);
        s.close();
        return;
    }

    int result = 1;
    while( n > 0){


        result *= x;
        n--;
    }
    System.out.println(result);
    s.close();
   }
    
}