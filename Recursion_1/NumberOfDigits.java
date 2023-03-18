package Recursion_1;
public class NumberOfDigits {
    

    public static int count(int n){
		//Write your code here
//Base condition
         if(n / 10 == 0){

             return 1;
         }

         return 1 + count(n / 10);
}
}
