package Patterns_2;

import java.util.Scanner;

public class Mirror_Image_Number_patter {
    
    public static void main(String[] args) {
        
       Scanner s = new Scanner(System.in);
       int n = s.nextInt();

       int i = 0;
       int x = n;
       while(i < n){

          int  j= 0;
          while( j < (n-(i+1))){

            System.out.print("* ");
            j++;
          }
        
          int k = x-(n-i-1);
          while( k > 0){

            System.out.print(k-- +  " ");

          }
          i++;
          System.out.println("");
       }
       s.close();
    }
}
