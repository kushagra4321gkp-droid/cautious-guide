public class LinearSearch {

    public static String searcher(int arr[], int key){
        for(int i = 0; i<arr.length; i++){
            if(arr[i]==key){
                return "key found at index : " + i;
            }
        }
        return "key not found";
    }

    public static void largestNum(int number[]){
        int largest = 0;
        for(int i = 0; i<number.length; i++){
            if(number[i] > largest){
                largest = number[i];
            }
        }
        System.out.print("largest number in the array ia : " + largest);
    }

    public static int binarySearch(int arr[], int key){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = (start + end) / 2;
            if(arr[mid] > key){
                end = mid - 1;
            }else if(arr[mid] < key){
                start = mid +1;
            }else if(arr[mid] == key){
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        // int arr[] = {2, 4, 6, 8, 10, 12, 14, 16};
        // int key = 10;
        // String status = searcher(arr, key);
        // System.out.println(status);

        //2nd program -> largest number
        // int number[] = {1, 2, 6, 3, 5, 11, 7, 99, 77, 3, 55};
        // largestNum(number);

        //BINARY SEARCH
        int[] arr = {2, 4, 6, 8, 10, 12, 14};
        int key = 10;
        int result = binarySearch(arr, key);
        if(result != -1){
            System.out.println("key is found at index : " + result);
        }else{
            System.out.println("key not found");
        }
    }
}