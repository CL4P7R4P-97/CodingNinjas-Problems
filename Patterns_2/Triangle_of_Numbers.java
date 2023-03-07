package Patterns_2;

import java.util.Scanner;

public class Triangle_of_Numbers {
    public static void main(String[] args) {
        

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int i =0 ;

        while( i < n){

            int j =0 ;
            while( j < (n-i-1)){

                System.out.print("* ");
                j++;
            }

            int k = 0;
            int t = i+1;
            while(k < 2*i+1){

                
                if(t <= 2*i+1){
                    System.out.print(t+" ");
                    t++;
                }
                k++;
            }
           t = t-2;
            while(t > i){
                System.out.print(t+" ");
                t--;
            }
            System.out.println("");
            i++;
        }
        s.close();
        
    }
}
