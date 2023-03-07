package Patterns_2;

import java.util.Scanner;

public class Diamond_of_stars {
    

    public static void main(String[] args) {
        

        
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int i =0 ;
        
        while( i < n/2){

            int j  =0;
           while( j < ( n/2 - i ) ){

            System.out.print(" ");
            j++;
           }


           int k= 0;
           while(k < (2*i+1)){

            System.out.print("*");
            k++;
           }
           System.out.println("");
           i++;
         

           
          

        }

        int t = 0;
        while(t < n){
         System.out.print("*");
t++;
     }
     System.out.println("");

        i  = n/2-1;
        while(i >= 0)
        {
            int j= n/2 - i;
             while( j > 0){
                System.out.print(" ");
            j--; 
            }

            int k= 0;
            while(k < (2*i+1)){
 
             System.out.print("*");
             k++;
            }
            System.out.println("");
            i--;


        }
        s.close();
    }
}
