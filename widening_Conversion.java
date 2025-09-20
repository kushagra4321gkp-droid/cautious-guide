import java.util.*;

public class widening_Conversion{
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        // int number = sc.nextFloat(); it will cause error cause, it is a lossy conversion.

        // Java allows this(below) and does it automaticaly for you, it is called Widening or Type of implecit conversion.
        float number = sc.nextInt();

        System.out.println(number);
    }
}