package _2D_Arrays;

public class SpiralPrint {

    public static void spiralPrint(int matrix[][]){
        //Your code goes here

    if(matrix.length == 0 || matrix[0].length == 0){
        return ;
    }
        
      int total = matrix[0].length * matrix.length;

int rs = 0, cs = 0, re = matrix.length-1, ce = matrix[0].length-1;

int count = 0;
      while( count != total){

      
      int j= cs;
      while(j <= ce){

          System.out.print(matrix[rs][j] + " ");
          count++;
          j++;
      }

      rs++;

      j = rs;
      
      while(j <= re){

          System.out.print(matrix[j][ce] + " ");
          count++;
          j++;
      }

      ce--;

      j = ce;

      while(j >= cs){

          System.out.print(matrix[re][j] + " ");
          count++;
          j--;
      }
     
     re--;
     j = re;

     while(j >= rs){

         System.out.print(matrix[j][cs] + " ");
         count++;
         j--;
     }
     cs++;


      }


    }
    
}
