public class InsertionSort {

    //Mam's code 
    public static void mamsCode(int arr[]){
        for(int i = 1; i<arr.length; i++){
            int curr = arr[i];
            int prev = i-1;
            //Finding out the correct position to insert
            while(prev >= 0 && arr[prev] > curr){
                arr[prev + 1] = arr[prev];
                prev--;
            }
            //Insertion
            arr[prev + 1] = curr;
        }
    }

    public static void insertionSort(int arr[]){
        for(int i = 0; i<arr.length; i++){
            for(int j = i+1; j>=1; j--){
                for(int k = i; k>=0; k--){
                    if(arr[k] > arr[j]){
                        int temp = arr[k];
                        arr[k] = arr[j];
                        arr[j] = temp;
            }
            }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 4, 1, 3, 2};
        //insertionSort(arr);
        mamsCode(arr);

        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}


// Didn't get it! Have to move forward