public class unary_operator{
    public static void main(String args[]){
        int a = 10;
        int b = ++a;
        System.out.println(a);
        System.out.println(b);

        int c = 10;
        int d = c++;
        System.out.println(c);
        System.out.println(d);


        //         Case 1: ++a (Pre-increment)

        // a = 10

        // ++a → increment a first → a = 11

        // Assign to b: b = 11

        // Print:

        // a = 11
        // b = 11

        //          Case 2: c++ (Post-increment)

        // c = 10

        // c++ → first use the old value (10), then increment c

        // Assign to d: d = 10

        // After this line finishes, increment happens → c = 11

        // Print:

        // c = 11
        // d = 10
    }
}