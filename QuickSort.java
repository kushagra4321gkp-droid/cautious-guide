public class QuickSort {

    // public static void quickSort(int arr[], int pivot){
    //     if(pivot == 0){
    //         return;
    //     }
    //     int j = 0;
    //     int i = -1;
    //     while(j < arr.length){
    //         if(arr[j] <= arr[pivot]){
    //         i++;
    //         int temp = arr[j];
    //         arr[j] = arr[i];
    //         arr[i] = temp;
    //     }
    //     j++;
    //     }
    //     quickSort(arr, pivot-1);
    // }

    public static void quickSort(int arr[], int si, int ei){
        if(si >= ei){
            return;
        }

        int pivotIndex = partition(arr, si, ei);

        quickSort(arr, si, pivotIndex-1);
        quickSort(arr, pivotIndex+1, ei);

    }

    public static int partition(int arr[], int si, int ei){
        int pivot = arr[ei];
        int i = si - 1;

        for(int j = si; j<ei; j++){
            if(arr[j] <= pivot){
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        int temp = arr[ei];
        arr[ei] = arr[i+1];
        arr[i+1] = temp;

        return i + 1;
    }

    public static void main(String[] args) {
        //int arr[] = {6, 3, 9, 8, 2, 5};
        int arr[] = {12, 34, 17, 99, 3, 4, 78, 11, 10, 24};
        // int arr[] = {2, 2, 2, 2, 1};
        // int arr[] = {5, 4, 3, 2, 1, 0};

        // int pivot = arr.length-1;
        quickSort(arr, 0, arr.length-1);

        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}

// Correct Code 
//-------------
// public class QuickSort {

//     public static void quickSort(int arr[], int low, int high) {
//         if (low >= high) {
//             return;
//         }

//         int pivotIndex = partition(arr, low, high);

//         // Recursively sort left and right parts
//         quickSort(arr, low, pivotIndex - 1);
//         quickSort(arr, pivotIndex + 1, high);
//     }

//     public static int partition(int arr[], int low, int high) {
//         int pivot = arr[high];
//         int i = low - 1;

//         for (int j = low; j < high; j++) {
//             if (arr[j] <= pivot) {
//                 i++;
//                 int temp = arr[i];
//                 arr[i] = arr[j];
//                 arr[j] = temp;
//             }
//         }

//         // Place pivot in its correct position
//         int temp = arr[i + 1];
//         arr[i + 1] = arr[high];
//         arr[high] = temp;

//         return i + 1;
//     }

//     public static void main(String[] args) {
//         int arr[] = {6, 3, 9, 8, 2, 5, 0, 1, 4};
//         quickSort(arr, 0, arr.length - 1);

//         for (int num : arr) {
//             System.out.print(num + " ");
//         }
//     }
// }



