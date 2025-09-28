import java.util.*;

public class productusingFunc{

    public static int calculateProduct(int num1, int num2){
        return num1 * num2;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int product = calculateProduct(a, b);
        System.out.println("product is : " + product); 
    }
}