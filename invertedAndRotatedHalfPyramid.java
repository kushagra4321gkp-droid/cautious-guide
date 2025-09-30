import java.util.*;

public class invertedAndRotatedHalfPyramid {

    public static void invertedPyramid(int row, int column){
        for(int i = 1; i<=row; i++){
            for(int j = 1; j<=column; j++){
                if((i+j==5) || j==column || i==row){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }  
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int column = sc.nextInt();
        invertedPyramid(row, column);
    }
}