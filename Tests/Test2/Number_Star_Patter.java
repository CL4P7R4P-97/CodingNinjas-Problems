package Tests.Test2;

import java.util.Scanner;

public class Number_Star_Patter {


    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
       s.close();
        int i = 0;

        while( i < n){


            int j = 1;
            while( j <= (n-i)){
                System.out.print(j);
                j++;
            }

            int k = 0;
            while( k < (i*2)){

                System.out.print("*");
                k++;
            }

            int t = n-i;

            while( t > 0){

                System.out.print(t);
                t--;
            }
System.out.println("");
            i++;
        }
    }
    
}
