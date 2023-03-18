package Recursion_assignment;

public class Pair_Star {

    public static String addStars(String s) {
		// Write your code here
       
       if(s.length() == 1){
           return s;
       }

       String res = addStars(s.substring(1));
       if(s.charAt(0) == res.charAt(0)){
           return s.charAt(0) + "*" + res;
       }
     return s.charAt(0) + res;
	}
    
}
