package Patterns_1;

/*
 Code : Triangle Number Pattern
Send Feedback
Print the following pattern for the given N number of rows.
Pattern for N = 4
1
22
333
4444
Input format :
Integer N (Total no. of rows)
Output format :
Pattern in N lines
Constraints
0 <= N <= 50
Sample Input 1:
5
Sample Output 1:
1
22
333
4444
55555
Sample Input 2:
6
Sample Output 2:
1
22
333
4444
55555
666666
 */

import java.util.Scanner;

public class TriangularNumPattern {
    
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 0;

        while( i < n){

            int j = 0;
            while( j < (i+1) ){

                System.out.print(i+1 + " ");
                j++;
            }
            System.out.println("");
            i++;
        }

        s.close();
    }
}
