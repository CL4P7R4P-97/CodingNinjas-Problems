package Tests.Test1;

import java.util.Scanner;

public class Number_Star_Pattern {


    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        s.close();
        int i = 0;
        while( i<n ){

            int  j = n;
            while( j > (i+1)){

                System.err.print(j);
                j--;
            }

            System.out.print("*");

            int k = i;
            while(k > 0){

                System.out.print(k);
                k--;
            }
    System.out.println("");
    i++;
        }
    }
    
}
