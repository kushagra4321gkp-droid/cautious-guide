public class unary_decrement{
    public static void main(String args[]){
        int a = 7;
        int b = a--;
        System.out.println(a);
        System.out.println(b);

        int c = 7;
        int d = --c; // becomes tricky when you write --a
        System.out.println(c);
        System.out.println(d);

                // post decrement
        // firstly 7 would be assigned to variable a that is a = 7, now a-- means first use the value of a then decrement a by 1. so in b varable a's value 7 would be assigned then printing a's value which is now 6, because of --a code, since it has been used and assigned to b. so after that it has been decremented to 6 and since a = 6 now so 6 would be printed the 7 would be printed.


    }
}