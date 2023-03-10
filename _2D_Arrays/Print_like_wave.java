package _2D_Arrays;

public class Print_like_wave {

    public static void wavePrint(int mat[][]){
		//Your code goes here
        int col = 0, row = 0;
        
        if( mat.length == 0 || mat[0].length == 0){
            return ;
        }
        while( col < mat[0].length){
            
            row  = 0;
            while( row < mat.length ){
                System.out.print(mat[row][col]+ " ");
                row++;
            }
            
             col++;
             row = row-1;
            while( row >=0 && col < mat[0].length){
                
                System.out.print(mat[row][col] + " ");
                row--;
            }
            
            col ++;
        }
	}
    
}
