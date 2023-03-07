package Tests.Test1;
import java.util.Scanner;

public class PalindromeOfNumber {
    

    public static void main(String[] args) {
        

        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
     int n = num;
        int rev = 0;
        while( num != 0){

            int rem = num % 10;
            num = num / 10;

            rev = rev * 10 + rem;

        }
        if(rev == n){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }

        s.close();
    }
}
