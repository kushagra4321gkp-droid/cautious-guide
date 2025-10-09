import java.util.Collections;
import java.util.Arrays;
public class inbuiltSort {
    public static void main(String[] args) {
        //int[] arr = {5, 4, 1, 3, 2};
        //Arrays.sort(arr); //will sort in ascending order
        //Arrays.sort(arr,0,3); //start and end provided

        Integer arr[] = {5, 4, 1, 3, 2};
        //Arrays.sort(arr, Collections.reverseOrder());
        Arrays.sort(arr, 0, 4, Collections.reverseOrder());
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}