package Patterns_2;

import java.util.Scanner;

public class SumPattern {
    


    public static void main(String[] args) {
        

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();


        int i = 0;
        while(i < n){

            int j = 0;
            int sum = 0;
            while(j < (i+1)){

                System.out.print(j+1);
                sum += (j+1);
                j++;
                if(j < (i+1)){
                    System.out.print("+");
                }
            }
                  i++;
                  System.out.print("="+ sum);
                  System.out.println("");
        }
        s.close();
    }
}
