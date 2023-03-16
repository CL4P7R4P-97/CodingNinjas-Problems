package Strings;

public class PrintSubstrings {

    public static void printSubstrings(String str) {
		//Your code goes here

		int i =0, j = 0;

		while( i < str.length()){

                      j= i+1;
			while( j <= str.length() ){


                      System.out.println(str.substring(i, j));
					  j++;

			}
			i++;
		}
	}
    
}
