import java.util.*;

public class Kadanes_Algo {

    public static void kadaneWay(int arr[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length; i++){
            currSum = currSum + arr[i];
            if(currSum < 0){
                currSum = 0;
            }
            maxSum = Math.max(currSum, maxSum);
        }
        System.out.print("maximum sum is : " + maxSum);
    }

    // public static int maxSubArray(int[] nums) {
    //     int currSum = nums[0];
    //     int maxSum = nums[0];

    //     for (int i = 1; i < nums.length; i++) {
    //         // currSum = max(nums[i], currSum + nums[i])
    //         if (currSum + nums[i] > nums[i]) {
    //             currSum = currSum + nums[i];
    //         } else {
    //             currSum = nums[i];
    //         }

    //         // maxSum = max(maxSum, currSum)
    //         if (currSum > maxSum) {
    //             maxSum = currSum;
    //         }
    //     }

    //     return maxSum;
    // }

    public static void main(String[] args) {
        int[] arr = {1, -2, 6, -1, -3};
        kadaneWay(arr);
        //System.out.println(maxSubArray(arr));
    }
}