package _2D_Arrays;

public class Largest_row_or_column {
    

    public static int [] maxRowSum(int arr[][]){
        int res[] = new int[2];
      if(arr.length == 0){
          return res;
      }
       
              int i = 0;
              
              int row = 0;
              int max  = Integer.MIN_VALUE;
              while(i < arr.length){
      
      
                   int sum  = 0;
                  int  j = 0;
                  while( j < arr[0].length){
      
                        sum = arr[i][j] + sum;
                        j++;
                  }
      
                  if(sum > max){
      
                      max = sum;
                      row = i;
                  }
                  i++;
              }
      
            
              res[0] = row;
              res[1] = max;
              
              
              return res ;
          }
      
      
            public static int [] maxColSum(int arr[][]){
      
       int res[] = new int[2];
      
      if(arr.length == 0){
          return res;
      }
       
      
              int i = 0;
              int col = 0;
              int max  = Integer.MIN_VALUE;
              while(i < arr[0].length){
      
      
                   int sum  = 0;
                  int j = 0;
                  while( j < arr.length){
      
                        sum = arr[j][i] + sum;
                        j++;
                  }
      
                  if(sum > max){
      
                      max = sum;
                      col = i;
                  }
                  i++;
              }
      
            
              res[0] = col;
              res[1] = max;
              
              
              return res ;
          }
      
      
      
      
          public static void findLargest(int mat[][]){
              //Your code goes here
              
              if(mat.length == 0 || mat[0].length == 0){
                  System.out.println("row " + 0 + " " + Integer.MIN_VALUE);
                  return;
              }
      
               int row[] = maxRowSum(mat);
               int col[]  = maxColSum(mat);
              
              if(row[1] >= col[1]  ){
      
                  if(row[1] == col[1] && row[1] == Integer.MIN_VALUE ){
                        System.out.println("row " + 0 + " " + Integer.MIN_VALUE);
                        return;
                  }
                  System.out.println("row " + row[0] + " " + row[1]);
              }
              else if(row[1] < col[1]){
      
                   System.out.println("column " + col[0] + " " + col[1]);
              }
              else{
                  System.out.println("row " +  0 + " " + Integer.MIN_VALUE);
              }
               
      
          }
}
