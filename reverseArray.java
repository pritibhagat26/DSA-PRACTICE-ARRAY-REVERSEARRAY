import java.util.*;
class reverseArray{

    static void reverse_array(int []arr){
        int n = arr.length;

        //temporary array to store elements in reverse order
        int [] temp = new int[n];

        //copy elements from original
        for(int i=0; i<n; i++){
            temp[i] = arr[n - i -1];
        }

        //copy elements in temp
        for(int i=0; i<n; i++){
            arr[i] = temp[i];
        }
    }
    public static void main(String [] args){
            
            int[] arr = {1, 2, 3, 4, 5, 6};

            reverse_array(arr);

            for(int i = 0; i<arr.length; i++){
                System.out.print(arr[i] + " ");
            }

    }
}