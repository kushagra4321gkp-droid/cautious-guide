import java.util.*;

public class HollowRectanglePattern {

    public static void patternPrinter(int row, int column){
        for(int i = 1; i<=row; i++){
            for(int j = 1; j<=column; j++){
                if(i == 1 || i == row || j == 1 || j == column){
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
        patternPrinter(row, column);
    }
}