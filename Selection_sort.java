import java.util.*;
public class Selection_sort {

    public static void selectionSort(int arr[]){
        for(int i = 0; i<=arr.length-2; i++){
            int miniPos = i;
            for(int j = i+1; j<arr.length; j++){
                if(arr[miniPos] > arr[j]){
                miniPos = j;
            }
            int temp = arr[miniPos];
            arr[miniPos] = arr[i];
            arr[i] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 4, 1, 3, 2};
        selectionSort(arr);
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}