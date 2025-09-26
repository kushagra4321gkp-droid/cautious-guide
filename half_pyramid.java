import java.util.*;

public class half_pyramid{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter lines : ");
        int lines = sc.nextInt();
        for(int i = 1; i<=lines; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(j + "  ");
            }
            System.out.println();
        }
    }
}