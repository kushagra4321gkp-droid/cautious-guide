public class Bubble_Sort {

    public static int bubbleSort(int arr[]){
        int swap = 0;
        for(int i = 0; i<arr.length-1; i++){
            for(int j = 0; j<=arr.length-(2+i); j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap++;
                }

            }
        }
        return swap;
    }

    public static void main(String[] args) {
        int[] arr = {5, 4, 1, 3, 2};
        //int[] arr = {5, 4, 1, 3, 2, 7, 8, 17, 12, 14}; //testing
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        System.out.print("number of swaps : " + bubbleSort(arr));
    }
}