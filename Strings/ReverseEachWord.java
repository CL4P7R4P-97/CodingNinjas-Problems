package Strings;

public class ReverseEachWord {

    public static String reverseEachWord(String str) {
        //Your code goes here
        
        if(str.length() == 0 || str.length() == 1){

                  return str;
        }

        String ans = "", newStr = "";

        int i = 0;

        while( i < str.length() ){

             if(str.charAt(i) != ' '){
                 newStr = str.charAt(i) + newStr;
              
             }
             else{
                   
               if(ans.length() == 0){
                     ans = ans   +  newStr;
                 
               }
               else{
                     ans = ans + " " +  newStr;
                
               }
                   newStr = "";
             }
            
            i++;

        }
         ans = ans + " " +  newStr;

        return ans;

    }
    
}
