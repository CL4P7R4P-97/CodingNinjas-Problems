package Arrays;

public class SumOf_2_Arrays {
    

    public static void sumOfTwoArrays(int arr1[], int arr2[], int arr3[]) {
       

        if(arr1.length == 0 && arr2.length == 0){
            
            return;
        }
        
        
        
               int i = arr1.length -1, j = arr2.length -1 , k = arr3.length-1 ;
        
              
        
            
             
             
              int ans = 0, c  = 0, fRes = 0;
        
              while(k > -1){
        
                  if(i >= 0){
        
                      if(j >= 0){
        
                          ans = arr1[i] + arr2[j] + c;
                           c = ans/10;
                           fRes = ans%10;
                           arr3[k--] = fRes;
                           i--;
                           j--;
                      }
                      else{
                           
                          ans = arr1[i]   + c;
                           c = ans/10;
                           fRes = ans%10;
                           arr3[k--] = fRes;
                           i--;
                      }
                  }
        
        
                  else  {
        
                     if(j >= 0){
        
                          ans =   arr2[j] + c;
                           c = ans/10;
                           fRes = ans%10;
                           arr3[k--] = fRes;
                           
                           j--;
                      }
                      
                      else{
        
                          arr3[k--] = c;
                          c = 0;
                          k--;
                      }
        
                  }
              }
        
        
            }
}
