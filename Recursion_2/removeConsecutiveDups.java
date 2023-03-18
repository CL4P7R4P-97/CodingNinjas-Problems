package Recursion_2;

public class removeConsecutiveDups {

    public static String removeConsecutiveDuplicates(String s) {
		// Write your code here
       
       if(s.length() == 1){
           return s;
       }

       String got = removeConsecutiveDuplicates(s.substring(1));

       if(s.charAt(0) == got.charAt(0)){
           return got;
       }
       else{
          return s.charAt(0) + got;
       }

	}
    
}
