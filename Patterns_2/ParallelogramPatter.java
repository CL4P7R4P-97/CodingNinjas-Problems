package Patterns_2;

import java.util.Scanner;

public class ParallelogramPatter {

    public static void main(String[] args) {
        

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int i  = 0;
        while(i < n){

            int j= 0;

            while( j<i){
                System.out.print(" ");
                j++;
            }

            int k = 0;
            while(k < n){
                System.out.print("*");
                k++;
            }
            System.out.println("");
            i++;
        }
        s.close();
    }
    
}
