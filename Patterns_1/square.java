package Patterns_1;

// Code : Square Pattern
// Send Feedback
// Print the following pattern for the given N number of rows.
// Pattern for N = 4
// 4444
// 4444
// 4444
// 4444
// Input format :
// Integer N (Total no. of rows)
// Output format :
// Pattern in N lines
// Constraints
// 0 <= N <= 50
// Sample Input 1:
// 7
// Sample Output 1:
// 7777777
// 7777777
// 7777777
// 7777777
// 7777777
// 7777777
// 7777777
// Sample Input 1:
// 6
// Sample Output 1:
// 666666
// 666666
// 666666
// 666666
// 666666
// 666666


import java.util.Scanner;

public class square {
    
    /**
     * @param args
     */
    public static void main(String []args) {


        //printing square patter with number say "n"

        Scanner s = new Scanner(System.in);
        int i = 0, n = s.nextInt();
       
        while( i < n ){

           int j = 0;
            while( j < n){

              System.out.print(n + " ");
                j++;
            }
            System.out.println("");
            i++;
        }

        s.close();
        
    }
}
