import java.util.*;

public class inverted_triangle{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter lines : ");
        int lines = sc.nextInt();
        for(int i = 1; i<=lines; i++){
            for(int j = 1; j<=lines-i+1; j++){
                System.out.print("*   ");
            }
            System.out.println();
        }
    }
}