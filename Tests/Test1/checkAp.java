package Tests.Test1;

import java.util.Scanner;

public class checkAp {


    public static void main(String[] args) {
        

        Scanner s = new Scanner(System.in);
        
        int num = s.nextInt();
     
        int i = 0;

        int prev = s.nextInt();
        int curr = s.nextInt();

        int d = curr -prev;
        while( i < (num-2)){


            prev = curr;
           curr = s.nextInt();
           if(curr - prev != d){

            System.out.println(false);
            return;
           }

           i++;
        }
        s.close();
        System.out.println(true);
    }
    
}
