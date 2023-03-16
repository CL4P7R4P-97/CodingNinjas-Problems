package Strings;

public class Get_CompressedString {

    public static String getCompressedString(String str) {
	
        if(str.length() == 0 || str.length() == 1){
            return "";
        }
        
        
        int i = 0, count = 0;
        String ans = "";
        while(i < str.length()){
        
            if(ans.length() == 0){
        
                 ans = ans + str.charAt(i);
                 count++;
            }
            else if(str.charAt(i) == ans.charAt(ans.length() -1) ){
        
                count ++;
            }
            else{
        
                if( count > 1){
                    ans = ans + "" + count+ "" + str.charAt(i);
                    count = 1;
                }
                else{
                    ans = ans + "" + str.charAt(i);
                    count = 1;
                }
                 
            }
            i++;
        }
        
        if(count > 1){
            ans = ans + "" + count;
        }
        return ans;
        
            }
    
}
