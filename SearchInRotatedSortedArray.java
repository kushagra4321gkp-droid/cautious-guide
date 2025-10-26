public class SearchInRotatedSortedArray {

    public static int modifiedBinarySearch(int arr[], int tar, int si, int ei){
        //Base case
        if(si > ei){
            return -1;
        }
        
        //kaam
        int mid = si + (ei - si) / 2; //(si + ei) /2

        //case Found
        if(tar == arr[mid]){
            return mid;
        }

        //mid on L1
        if(arr[si] < arr[mid]){
            //Left
            if(arr[si] <= tar && tar <= arr[mid]){
                return modifiedBinarySearch(arr, tar, si, mid-1);
            }
            //Right
            else{
                return modifiedBinarySearch(arr, tar, mid+1, ei);
            }
        }

        //mid on L2
        if(arr[ei] >= arr[mid]){
            //Right
            if(arr[mid] <= tar && tar<= arr[ei]){
                return modifiedBinarySearch(arr, tar, mid+1, ei);
            }
            //Left
            else{
                return modifiedBinarySearch(arr, tar, si, mid-1);
            }
        }
        return mid;
    }

    public static void main(String[] args) {
        int arr[] = {4, 5, 6, 7, 0, 1, 2};
        int tar = 7;
        //int tar = 0;
        int index = modifiedBinarySearch(arr, tar, 0, arr.length-1);
        System.out.println(index);

    }
}

//WRAPPER FUNCTION
//----------------
//public class Solution {
//     public static int search(int[] nums, int target) {
//         return search(nums, target, 0, nums.length - 1);
//     }
//     public static int search(int[] nums, int target, int si, int ei) {
//         if(si > ei){
//             return -1;
//         }
//         int mid = si + (ei - si)/2;
//         if(nums[mid] == target){
//             return mid;
//         }
//         if(nums[si] <= nums[mid]){
//             if(nums[si] <= target && target <= nums[mid]){
//                 return search(nums, target, si, mid-1);
//             }else{
//                 return search(nums, target, mid+1, ei);
//             }
//         }
//         if(nums[ei] > nums[mid]){
//             if(nums[mid] <= target && target <= nums[ei]){
//                 return search(nums, target, mid+1, ei);
//             }else{
//                 return search(nums, target, si, mid-1);
//             }
//         }
//         return mid;
//     }
//     public static void main(String args[]){
//         int[] nums = {4,5,6,7,0,1,2};
//         int target = 0;
//         System.out.println(search(nums, target, 0, nums.length-1));
//     }
// }
