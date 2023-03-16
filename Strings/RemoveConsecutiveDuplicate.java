package Strings;

public class RemoveConsecutiveDuplicate {

    public static String removeConsecutiveDuplicates(String str) {
		//Your code goes here
        
        if(str.length() == 0 || str.length() ==1){
            return str;
        }

    String newStr = "";
    int i =0;
    while( i < str.length()){

        if(newStr.length() == 0){
            newStr = newStr + str.charAt(i);
            i++;
        }
        else{

            if( newStr.charAt(newStr.length()-1) != str.charAt(i)){
                newStr = newStr + str.charAt(i);
            }
           i++;
        }
        
    }

    return newStr;
}
    
}
