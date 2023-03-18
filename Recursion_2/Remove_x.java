package Recursion_2;

public class Remove_x {
    
    public static String removeX(String input){
		// Write your code here
        if(input.length() == 0){
            return input;
        }

        String got = removeX(input.substring(1));
        if(input.charAt(0) == 'x'){
            return got;
        }
        else{

            return input.charAt(0) + got;
        }

	}
}
