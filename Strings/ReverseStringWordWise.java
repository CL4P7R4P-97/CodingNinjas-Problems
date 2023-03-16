package Strings;

public class ReverseStringWordWise {

    public static String reverseWordWise(String input) {
		// Write your code here
		
		int i = 0;
        String newStr = "";
		String ans = "";
		while( i < input.length()){

         if(input.charAt(i) != ' '){

               newStr =    newStr + input.charAt(i);
		 }
		 else{
             if( ans.equals("")){
				 ans = newStr + ans;
			 } 
			 else{
				 ans = newStr + " " + ans;
			 }
				 newStr = "";
		 }
		  i++;

		}
		ans = newStr +" " +  ans;

                return ans;
	}
    
}
