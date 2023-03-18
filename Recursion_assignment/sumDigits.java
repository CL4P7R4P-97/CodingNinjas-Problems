package Recursion_assignment;

public class sumDigits {

    public static int sumOfDigits(int input){
		// Write your code here
  // System.out.println(input);
       
       if(input == 0){
           return 0;
       }
 
       int D = input % 10;
       int result = sumOfDigits(input/10);
       return result + D;

	}
    
}
