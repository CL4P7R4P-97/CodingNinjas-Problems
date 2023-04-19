package LinkedList_I;

import java.util.ArrayList;

public class RemoveConsecutiveDuplicates {
    


public static ArrayList<Integer> removeConsecutive(int arr[]){

    ArrayList<Integer> uArr = new ArrayList<>();
    int i = 0, old = -1;

    while( i < arr.length){
    
        if(arr[i] != old){

            uArr.add(arr[i]);
            old = arr[i];
        }

        i++;

    }



return uArr;
}

public static void main(String args[]){

    int arr[] = {10,10,20,20,20,30,30,40,40,40,50,60,70,80};

    ArrayList<Integer> nArr = removeConsecutive(arr);

    for(int k: nArr){
 
        System.out.print(k + " ");
    }
}
}
