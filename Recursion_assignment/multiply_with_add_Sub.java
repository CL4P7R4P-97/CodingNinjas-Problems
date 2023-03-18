package Recursion_assignment;

public class multiply_with_add_Sub {


    public static int multiplyTwoIntegers(int m, int n){
		// Write your code here
      
      if( n == 0){
          return 0;
      }

      int result = multiplyTwoIntegers(m, n-1);
      return m + result;
	}
    
}
