/*
Code : Alpha Pattern
Send Feedback
Print the following pattern for the given N number of rows.
Pattern for N = 3
A
BB
CCC
Input format :
Integer N (Total no. of rows)
Output format :
Pattern in N lines
Constraints
0 <= N <= 26
*/

package Patterns_1;

import java.util.Scanner;



public class AlphaPattern {


public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int i = 0;

    while( i < n){

        int j = 0;
        while( j < (i+1) ){

            System.out.print((char)('A' + i ) + " ");
            j++;
        }
        System.out.println("");
        i++;
    }

    s.close();
}
}
