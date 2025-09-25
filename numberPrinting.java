import java.util.*;

public class numberPrinting{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n = sc.nextInt(), i=1;
        while (i<=n){
            System.out.print(i + "  ");
            i += 1;
        }
    }

}