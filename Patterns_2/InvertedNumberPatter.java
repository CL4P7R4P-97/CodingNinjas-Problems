package Patterns_2;

import java.util.Scanner;

/*
 Code : Inverted Number Pattern
Send Feedback
Print the following pattern for the given N number of rows.
Pattern for N = 4
4444
333
22
1
Input format :
Integer N (Total no. of rows)
Output format :
Pattern in N lines
Constraints :
0 <= N <= 50
Sample Input 1:
5
Sample Output 1:
55555 
4444
333
22
1
Sample Input 2:
6
Sample Output 2:
666666
55555 
4444
333
22
1
 */

public class InvertedNumberPatter {
    
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 0;
        while( i<n ){

            int j = 0;
            while( j < (n-i)){
                System.out.print(n-i + " ");
                j++;
            }
            System.out.println("");
            i++;
           
        }
        s.close();
 

    }
}
