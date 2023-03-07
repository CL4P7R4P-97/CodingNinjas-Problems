package Operators_And_Loops;

import java.util.Scanner;

public class SumOrProduct {


    public static void add(int n) {
        
        int sum = 0;
        for(int i  = 1; i <= n; i++){

            sum += i;

        }
        System.out.println(sum);
    }

    public static void product(int n) {
        
        long pro = 1;
        for(int i  = 1; i <= n; i++){

            pro *= i;

        }
       
        
        System.out.println(pro);

    }

    public static void main(String[] args) {
        

        Scanner s = new Scanner(System.in);

        int  n = s.nextInt();
        int  c = s.nextInt();


        switch(c){

            case 1: 
                   add(n);
                   break;
            
            case 2: 
                    product(n);
                    break;
            
            default: 
                   System.out.println("Please chose correct option out of 1 or 2");

        }
        s.close();

        
    }
    
}
