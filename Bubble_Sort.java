public class Bubble_Sort {

    public static void bubbleSort(int arr[]){
        for(int i = 0; i<arr.length-1; i++){
            for(int j = 0; j<=arr.length-(2+i); j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 4, 1, 3, 2};
        //int[] arr = {5, 4, 1, 3, 2, 7, 8, 17, 12, 14}; //testing
        bubbleSort(arr);
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}