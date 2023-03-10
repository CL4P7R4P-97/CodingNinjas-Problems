package _2D_Arrays;

public class Boundries_SUM {
    

    public static void totalSum(int[][] mat) {
		//Your code goes here
        
if(mat.length == 0){
   System.out.println(0);
   return;
}


        //ROW SUM
        int totalSum = 0;
         int   j = 0, rSUM = 0 ;
         
          
             

             while(j < mat[0].length){


                            rSUM  += mat[0][j];
                            rSUM  += mat[mat.length -1][j];

                 j++;
             }
            

         //COL SUM

        int cSUM = 0;
        j= 1;

         while(j < mat.length-1 )
         {

           cSUM += mat[j][0];
            cSUM  += mat[j][mat[0].length-1];
             j++;
         }
         

         //DIAG SUM
         int dSUM = 0;
         j = 1;
         while(j < mat[0].length-1){
        
              dSUM += mat[j][j];
              dSUM += mat[j][mat[0].length-j-1];
              j++;

         }


         if( mat.length % 2 != 0){
          
          totalSum = rSUM + cSUM + dSUM - mat[ mat.length/2][mat.length/2];

         }else{

             totalSum = rSUM + cSUM + dSUM;
         }
       
       System.out.println(totalSum);

         
         
	}

}
