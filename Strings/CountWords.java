package Strings;

public class CountWords {

    public static int countWords(String str) {	
		//Your code goes here
		if(str.length() == 0){
			return 0;
		}

		int i  =0, len = str.length();
        int wordCount = 0;
	 while(i < len){

		 if(str.charAt(i) == ' '){

                wordCount += 1;
		 }
		 i++;
	 }

	 return wordCount+1;

	}

    
}
