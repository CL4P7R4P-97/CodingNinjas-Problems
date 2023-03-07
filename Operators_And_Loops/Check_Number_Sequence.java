package Operators_And_Loops;

import java.util.Scanner;

public class Check_Number_Sequence {
    

    public static void main(String[] args) {
        

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int prev = -1;
        boolean isDec = true;
        int i = 0;
        while( i < n){

          
            int curr = s.nextInt();
            if(n == 1){
            
                System.out.println(true);
                return;
            }

            if(prev == curr){
                System.out.println(false);
                return;
            }

            if(prev != -1){

                if(curr > prev){
                    isDec  = false;
                }
            }

            if(curr < prev && prev != -1){

                if(isDec == false){
                    System.out.println(false);
                    return;
                }
            }

            prev = curr;

i++;
        }
        s.close();
        System.out.println(true);
        
    }
}
