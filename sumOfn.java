import java.util.*;

public class sumOfn{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter any number n : ");
        int n = sc.nextInt();
        int i = 1, sum = 0;
        while(i<=n){
            sum = sum + i;
            i += 1;
        }
        System.out.println("Sum of first "+n+" natural numbers is "+sum);

    }
}