public class reverseArray {

    // public static void revArray(int arr[], int revArr[]){
    //         int value = arr.length-1;
    //         for(int i = 0; i<=value; i++){
    //             for(int j = 0; j<=value; j++){
    //                 if(i+j == value){
    //                     revArr[i] = arr[j];
    //                 }
    //             }
    //         }
    //         for(int i = 0; i<=value; i++){
    //             System.out.print(revArr[i] + " ");
    //         }
    //     }

    public static void mamsLogic(int numbers[]){
        int first = 0, last = numbers.length-1;

        while(first < last){
            int temp = numbers[last];
            numbers[last] = numbers[first];
            numbers[first] = temp;

            first++;
            last--;
        }
    }

    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 8, 10};
        // int Length = arr.length;
        // int[] revArr = new int[Length];
        // //System.out.println((revArr.length)); 
        // revArray(arr, revArr);

        //mam's logic (optimized)
        mamsLogic(numbers);
        for(int i = 0; i<=numbers.length-1; i++){
            System.out.print(numbers[i] + " ");
        }
    }
}