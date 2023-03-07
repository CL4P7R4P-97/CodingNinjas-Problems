import java.util.*;
public class Factors {
    

    public static void main(String []args){


        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        //setting limit as number above half wont divide input number; thus making code efficient
        int limit = num/ 2;
        int i = 2;

        while(i <= limit){

            if( num%i == 0){
                System.out.print(i+ " ");
            }
            i++;
        }
        s.close();
    }
}
