public class prefixSum {

    public static void subarrys(int arr[]){
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        int[] prefixArray = new int[arr.length];

        prefixArray[0] = arr[0];

        //calculating prefix Array
        for(int i = 1; i<prefixArray.length; i++){
            prefixArray[i] = prefixArray[i-1] + arr[i];
        }
        
        for(int i = 0; i<=arr.length-1; i++){
            int start = i;
            for(int j = i; j<=arr.length-1; j++){
                int end = j;
                sum = (start == 0)?prefixArray[end] : prefixArray[end] - prefixArray[start-1];
                if(sum>maxSum){
                    maxSum = sum;
                } 
            } 
        }
        System.out.print("max sum is : " + maxSum);
    }


    public static void main(String[] args) {
        // int[] arr = {2, 4, 6, 8, 10};
        int[] arr = {1, -2, 6, -1, 3};
        subarrys(arr);
        
    }
}