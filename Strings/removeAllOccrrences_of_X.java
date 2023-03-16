package Strings;

public class removeAllOccrrences_of_X {

    public static String removeAllOccurrencesOfChar(String str, char ch) {
		// Your code goes here
        if(str.length() == 0){
            return "";
        }
        String ans = "";

        int i =0;

        while( i < str.length()){

            if(str.charAt(i) != ch){
                ans = ans + str.charAt(i);
            }
            i++;
        }
        return ans;
	}
    
}
