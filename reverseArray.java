public class reverseArray {

    public static void revArray(int arr[], int revArr[]){
            int value = arr.length-1;
            for(int i = 0; i<=value; i++){
                for(int j = 0; j<=value; j++){
                    if(i+j == value){
                        revArr[i] = arr[j];
                    }
                }
            }
            for(int i = 0; i<=value; i++){
                System.out.print(revArr[i] + " ");
            }
        }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10};
        int Length = arr.length;
        int[] revArr = new int[Length];
        //System.out.println((revArr.length)); 
        revArray(arr, revArr);
    }
}