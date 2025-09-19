import java.util.*;

public class input_in_java {
    public static void main(String args[]){
        // created Scanner class object
        // sc is the name of the object
        Scanner sc = new Scanner(System.in);
        // used .next() function for single word input
        String input = sc.next();
        sc.nextLine();
        // printing input
        System.out.println(input);

        String name = sc.nextLine();
        System.out.println(name);

        int a = sc.nextInt();
        System.out.println(a);

        float f = sc.nextFloat();
        System.out.println(f);


    }
}