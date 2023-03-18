package Recursion_assignment;

public class countZeroes {

    public static int countZerosRec(int input){
		// Write your code here
		if(input == 0){
			return 1;

		}
        
		int currRes = 0;
		if(input % 10 == 0){
			currRes = 1;
		}
		int result = 0;
		int pass = input /10;
		if(pass != 0){
                    result = countZerosRec(input/10);
		}
		return result + currRes;
    
	}

    
}
