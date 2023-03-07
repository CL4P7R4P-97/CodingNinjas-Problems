package Patterns_2;

import java.util.Scanner;

public class HalfDiamond {
    

    public static void main(String[] args) {
        

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();



        int i = 0;
        System.out.println("*");

        while( i < n){

           
            int j =0;
             System.out.print("*");
            while( j<(i+1)){

                
            System.out.print(j+1);
            j++;
            }

            while((j-1) > 0){
                System.out.print(j-1);
                j--;
            }

            System.out.print("*");
            System.out.println("");
            i++;
        }


        i = n-1;
        while(i >= 0){

            int j =0;
             System.out.print("*");
            while( j<(i+1)){

                
            System.out.print(j+1);
            j++;
            }

            while((j-1) > 0){
                System.out.print(j-1);
                j--;
            }

            System.out.print("*");
            System.out.println("");
            i--;

        }

        s.close();
        
    }
}
