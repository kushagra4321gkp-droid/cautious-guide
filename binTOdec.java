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
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bin = sc.nextInt();
        int result = binaryToDecimal(bin);
        System.out.print("decimal equivalent is : " + result);
    }
}