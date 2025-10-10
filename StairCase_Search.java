public class StairCase_Search {

    public static boolean stairSearch(int matrix[][], int key){
        // for(int i = 0; i<matrix.length; i++){
        //     for(int j = matrix[0].length-1; j>=0; j--){
        //         if(key > matrix[i][j]){
        //             break;
        //         }
        //         if(key == matrix[i][j]){
        //             System.out.print("key found at index : " + i + "," + j);
        //         }
        //     }
        // }

        //This was my Pure Logic, little glitch is there
        // int j = matrix[0].length-1;
        // int i = 0;
        // while((i < matrix.length) && (j >= 0)){
        //     if(key > matrix[i][j]){
        //         i++;
        //     }
        //     j--;
        //     if(matrix[i][j] == key){
        //         System.out.print("key found at index : (" + i + "," + j + ")");
        //     }
        // }

        //TRUE Logic in upper logic j is decrementing every time
        int j = matrix[0].length-1;
        int i = 0;
        //while((i < matrix.length) && (j >= 0)){
        while(j >= 0){    
            if(matrix[i][j] == key){
                System.out.print("key found at index : (" + i + "," + j + ")");
                return true;
            }
            else if(key < matrix[i][j]){
                j--;
            }
            else{
                i++;
            } 
        }
        System.out.print("key not found");
        return false;
    }

    public static void main(String[] args) {
        int matrix[][] = {
            {10, 20, 30, 40},
            {15, 25, 35, 45},
            {27, 29, 37, 48},
            {32, 33, 39, 50}
        };

        stairSearch(matrix, 33);
    }
}

// it was accepted on leetcode
// public class Solution {
//     public static boolean searchMatrix(int[][] matrix, int target) {
//         int i = 0;
//         int j = matrix[0].length-1;
//         while(i < matrix.length && j>=0){
//             if(target == matrix[i][j]){
//                 return true;
//             }else if(target > matrix[i][j]){
//                 i++;
//             }else{
//                 j--;
//             }
//         }
//         return false;
//     }
//     public static void main(String args[]){
//         int matrix[][] = {
//             {1, 3, 5, 7},
//             {10, 11, 16, 20},
//             {23, 30, 34, 60}
//         };
//         searchMatrix(matrix, 3);
//     }
// }