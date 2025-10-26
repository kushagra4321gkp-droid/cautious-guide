public class MergeSortAlgo {

    public static void printArr(int arr[]){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void merge(int arr[], int si, int mid, int ei){
        int temp[] = new int[ei - si +1];
        int i = si;
        int j = mid + 1;
        int k = 0;
        while (i <= mid && j <= ei) {
            if(arr[i] < arr[j]){
                temp[k] = arr[i];
                i++;
            }else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        while(i <= mid){
            temp[k++] = arr[i++];
        }

        while(j <= ei){
            temp[k++] = arr[j++];
        }

        for(i = si, k = 0; k<temp.length; i++, k++){
            arr[i] = temp[k];
        }
    }

    public static void mergeSort(int arr[], int si, int ei){
        if(si >= ei){
            return;
        }

        int mid = si + (ei - si) / 2;
        mergeSort(arr, si, mid);
        mergeSort(arr, mid+1, ei);
        merge(arr, si, mid, ei);
    }

    public static void main(String[] args) {
        int arr[] = {6, 3, 9, 5, 2, 8};
        mergeSort(arr, 0, arr.length-1);
        printArr(arr);
    }
}

//This is crucial!
//----------------
// why i should i = si explain more
// ChatGPT said:

// Excellent — this is exactly the kind of “deep understanding” question you should ask 👏

// Let’s slow down and visualize why that i = si matters.

// 🧩 Step-by-step: what’s going on

// In Merge Sort, your array is being divided into smaller parts (subarrays).
// Each recursive call doesn’t sort the entire array — it only sorts a section of it.

// Example array:

// arr = [6, 3, 9, 5, 2, 8]


// When merge sort runs, one of its recursive calls will be like:

// merge(arr, si=0, mid=2, ei=5)


// which means → we are only merging the subarray from index 0 to 5 (the entire array).

// But deeper in recursion, you’ll also get calls like:

// merge(arr, si=0, mid=0, ei=1)
// merge(arr, si=2, mid=2, ei=3)
// merge(arr, si=4, mid=4, ei=5)


// These are small portions of the array — not starting at 0!

// 💥 The bug when you used i = 0

// Your code:

// for (i = 0, k = 0; k < temp.length; i++, k++) {
//     arr[i] = temp[k];
// }


// Here, you always start overwriting from arr[0],
// even when the merge was supposed to happen somewhere later in the array.

// So imagine this case:

// merge(arr, si=4, mid=4, ei=5)


// This means: merge the part [2, 8] inside the original array.

// But your loop says:

// arr[0] = temp[0]
// arr[1] = temp[1]


// 😱 So instead of putting the sorted [2, 8] back into positions 4 and 5,
// you’re writing them into positions 0 and 1 — completely overwriting the earlier part of the array.

// That’s why your final result was messed up like:

// 5 2 5 2 8 8


// because earlier merges kept getting overwritten.

// ✅ The fix: i = si

// When you write:

// for (i = si, k = 0; k < temp.length; i++, k++) {
//     arr[i] = temp[k];
// }


// Now, the merged result goes exactly where it belongs:

// If we were merging [0–1], it copies into arr[0] and arr[1].

// If we were merging [4–5], it copies into arr[4] and arr[5].

// 💡 si means “start index of the part currently being merged”.
// Every merge operates on a different “window” of the array.
// So we start copying from that window’s beginning — not from the start of the full array.

// 🧠 Analogy

// Think of your array as a row of boxes labeled 0–5.

// During merge sort, you sometimes sort:

// Boxes 0–1

// Boxes 2–3

// Boxes 4–5

// When you finish sorting “boxes 4–5”,
// you must put the sorted numbers back into boxes 4 and 5 — not boxes 0 and 1!

// Setting i = si ensures you’re putting things back where they came from.


//LeetCode 912
//--------
//public class Solution {
//     public static void merge(int arr[], int si, int mid, int ei){
//         int temp[] = new int[ei - si +1];
//         int i = si;
//         int j = mid + 1;
//         int k = 0;
//         while (i <= mid && j <= ei) {
//             if(arr[i] < arr[j]){
//                 temp[k] = arr[i];
//                 i++;
//             }else{
//                 temp[k] = arr[j];
//                 j++;
//             }
//             k++;
//         }
//         while(i <= mid){
//             temp[k++] = arr[i++];
//         }
//         while(j <= ei){
//             temp[k++] = arr[j++];
//         }
//         for(i = si, k = 0; k<temp.length; i++, k++){
//             arr[i] = temp[k];
//         }
//     }
//     public static void mergeSort(int arr[], int si, int ei){
//         if(si >= ei){
//             return;
//         }

//         int mid = si + (ei - si) / 2;
//         mergeSort(arr, si, mid);
//         mergeSort(arr, mid+1, ei);
//         merge(arr, si, mid, ei);
//     }
//     public int[] sortArray(int[] nums) {
//         mergeSort(nums, 0, nums.length - 1);
//         return nums;
//     }
// }

