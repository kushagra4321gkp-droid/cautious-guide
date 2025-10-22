public class FirstOccurenceInArray {
    public static void main(String[] args) {
        int arr[] = {8, 3, 6, 9, 5, 10, 2, 5, 3};
        int key = 5;
        int i = 0;
        System.out.println(firstOccurence(arr, key, i));
    }

    public static int firstOccurence(int arr[], int key, int i){
        if(i == arr.length-1){
            if(arr[i] == key){
                return i;
            }
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        i++;
        return firstOccurence(arr, key, i);
    }
}
