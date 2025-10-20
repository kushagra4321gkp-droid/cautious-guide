public class arrayIsSortedOrNot {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int i = 0;
        isSorted(arr, 0);
    }

    public static void isSorted(int arr[], int i){
        if(i == arr.length-1){
            System.out.println("sorted");
            return;
        }
        if(arr[i] > arr[i+1]){
            System.out.println("not sorted!");
            return;
        }
        i++;
        isSorted(arr, i);
    }
}


