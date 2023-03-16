package Strings;

public class ValidStringPermutation {

    public static boolean isPermutation(String str1, String str2) {
       

        if(str1.length() != str2.length()){
            return false;
        }
 
        int arr[] = new int[256];
 
        int i =0;
 
        while( i< str1.length()){
 
            arr[str1.charAt(i)]++;
            i++;
        }
 
        i = 0;
 
        while(i < str2.length()){
 
            arr[str2.charAt(i)]--;
            i++;
        }
 
 i = 0;
        while(i < arr.length ){
 
            if(arr[i] != 0){
                return false;
            }
            i++;
        }
 
 
        return true;
 
     }
    
}
