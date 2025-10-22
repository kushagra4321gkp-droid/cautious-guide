public class LastOccurenceInArray {
    public static void main(String[] args) {
        int i = 0, index = 0, key = 3;
        int arr[] = {8, 3, 6, 9, 5, 10, 2, 5, 3};
        System.out.println(lastOccurence(arr, key, i, index));
    }

    public static int lastOccurence(int arr[], int key, int i, int index){
        if(i == arr.length){
            return index;
        }
        if(arr[i] == key){
            index = i;
        }
        i++;
        return lastOccurence(arr, key, i, index);
    }
}    
