package Recursion_assignment;

public class ConvertingStringToInt {

    public static int convertStringToInt(String input){
		// Write your code here
    
       if(input.length() == 1){
        
         return input.charAt(0) - '0';
       }


       int res = convertStringToInt(input.substring(0,input.length()-1));
      
     int  fDigit = (int)input.charAt(input.length()-1) %48 ;
       

       return res * 10+ fDigit;
 
        // System.out.println(input);
      

	}
    
}
