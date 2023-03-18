package Recursion_assignment;

public class findGeometric_SUM {

    public static double findGeometricSum(int k){
		// Write your code here
        
     if(k == 0){
         return 1;
     }

     double result = findGeometricSum(k-1);

     return result + 1/(Math.pow(2, k));

        
	}
    
}
