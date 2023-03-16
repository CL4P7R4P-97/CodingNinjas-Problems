package Strings;

public class Highest_Occurrence_Character {
    

    public static int max(int arr[]){

        int max = Integer.MIN_VALUE;
        int index = -1;
        int i = 0;
        while( i < arr.length){

            if(arr[i] > max){
                max = arr[i];
                index = i;
            }

            i++;
        }

        return index;
    }

	public static char highestOccuringChar(String str) {
		//Your code goes here
       
       if(str.length() == 0 ){
           return ' ' ;
       }
       if(  str.length() == 1){
           return str.charAt(0);
       }

       int arr[]  = new int[256 + 1];
       

       int i= 0;

       while( i < str.length()){

            arr[str.charAt(i)]++;
            i++;

       }

       return (char)(max(arr));
	}

}
