import java.util.*;
public class CreationOf2D_Array {

    public static boolean search(int matrix[][], int key){

        for(int i = 0; i<matrix.length; i++){
            for(int j = 0; j<matrix[0].length; j++){
                if(matrix[i][j] == key){
                    System.out.println("key found at index (" + i + "," + j + ")");
                    return true;
                }
            }
        }
        System.out.println("key not found");
        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int matrix[][] = new int[3][3];
        int n = matrix.length, m = matrix[0].length;
        System.out.print("enter key : ");
        int key = sc.nextInt();

        System.out.print("enter matrix elements : ");
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        search(matrix, key);        

    }
}