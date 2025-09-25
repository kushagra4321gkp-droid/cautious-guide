import java.util.*;

public class reverseTheNumber{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number : ");
        int n = sc.nextInt();
        String reversed = "";
        while(n!=0){
            int t = n % 10;
            reversed += t;
            n = n / 10;
        }
        System.out.println(reversed);
    }
}