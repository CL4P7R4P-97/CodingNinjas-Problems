package Recursion_1;
public class PrintFirstN_natural_nums {
    
    public static void print(int n){
		//Write your code here
        //Base condition
        
       if(n == 0){
           return;
       }
      
       print(n-1);
        System.out.print(n + " ");
       return;

}
}
