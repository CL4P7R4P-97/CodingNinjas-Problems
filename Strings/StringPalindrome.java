package Strings;

public class StringPalindrome {
    
    public static boolean isPalindrome(String str) {
		//Your code goes here

        if(str.length() == 0){
			return false;
		}

		int i =0, j = str.length()-1;

		while( i < j){

			if(str.charAt(i) != str.charAt(j)){
				return false;
			}
			i++;
			j--;
		}

		return true;
	}
}
