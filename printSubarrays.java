public class printSubarrays {

    public static void subarrys(int arr[]){
        for(int i = 0; i<=arr.length-1; i++){
            System.out.println(arr[i]);
            for(int j = i+1; j<=arr.length-1; j++){
                //System.out.print("[" + arr[i] + "," + arr[j] + "]");
                //System.out.print("[");
                for(int k = i; k<=j ; k++){
                    System.out.print(arr[k] + " ");
                }
                //System.out.print("]");
                System.out.println();
            }
            System.out.println();
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10};
        subarrys(arr);
    }
}