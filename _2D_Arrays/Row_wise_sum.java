package _2D_Arrays;

public class Row_wise_sum {

    public static void rowWiseSum(int[][] mat) {
		//Your code goes here
        //Easy peazy lemon squeezy
        
        int i = 0, j = 0;

        while( i < mat.length){

           
           int sum = 0;
         j =0;
            while( j < mat[0].length){

                sum = sum + mat[i][j];
                j++;
            }
            i++;
            System.out.print(sum + " ");
        }
	}

    
}
