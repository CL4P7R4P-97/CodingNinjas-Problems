package Operators_And_Loops;

import java.util.Scanner;

public class BinaryToDecimal {


public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);

int num = s.nextInt() ;
double decimal = 0;
int i = 1;
// while( num != 0){

//     int bit = num % 10;
//     num =  num/10;
//     if( bit != 0){

//     decimal += Math.pow(2, i);
//     }

//     i++;

// }

while( num != 0){

    int bit = num % 10;
    num =  num/10;
     
    decimal += bit * i;
    i = i*2;
    i++;

}

System.out.println(decimal);

s.close();

}
}
