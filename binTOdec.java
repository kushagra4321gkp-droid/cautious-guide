import java.util.*;

public class binTOdec {
    public static int binaryToDecimal(int bin){
        int pow = 0;
        int dec = 0;
        while(bin > 0){
            int lastD = bin % 10;
            dec = dec + (lastD * (int)Math.pow(2, pow));
            bin = bin / 10;
            pow++;
        }
        return dec;
    }
    
    public static void decTObin(int n){
        int dec = n;
        int pow = 0;
        int bin = 0;
        while(n>0){
            int rem = n % 2;
            bin = bin + (rem * (int)Math.pow(10, pow));
            pow++;
            n = n / 2;
        }
        System.out.print("binary equivalent to " + dec + " is : " + bin);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int bin = sc.nextInt();
        // int result = binaryToDecimal(bin);
        // System.out.print("decimal equivalent is : " + result);

        int n = sc.nextInt();
        decTObin(n);

    }
}