package Operators_And_Loops;

import java.util.Scanner;

public class All_Prime_Numbers {

    public static void main(String[] args) {
        

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int i  = 2;
        while(i < n){

            if(i == 2){
                System.out.println(i);
                i++;
                continue;
            }

            int j = 2 ;
            while( j <= i/2 ){

                if( i % j == 0){
                    i++;
                    continue;

                }
                j++;
            }
            System.out.println(i);
            i++;
        }
        s.close();
    }
    
}
