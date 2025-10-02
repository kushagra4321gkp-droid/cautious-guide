import java.util.*;

public class printSubarrays {

    public static void subarrys(int arr[]){
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        
        for(int i = 0; i<=arr.length-1; i++){
            for(int j = i; j<=arr.length-1; j++){
                sum = 0;
                for(int k = i; k<=j ; k++){
                    sum = sum + arr[k];
                }
                System.out.print(sum + " ");
                if(sum>maxSum){
                        maxSum = sum;
                    }
                System.out.println();
            }
            System.out.println();
            
        }
        System.out.println("max sum is : " + maxSum);
    }

    public static void main(String[] args) {
        // int[] arr = {2, 4, 6, 8, 10};
        int[] arr = {1, -2, 6, -1, 3};
        subarrys(arr);
    }
}