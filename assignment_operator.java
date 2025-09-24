public class assignment_operator{
    public static void main(String args[]){
        int a = 10;
        a += 5;
        System.out.println(a);

        int b = 18;
        b -= 7;
        System.out.println(b);

        // same for *=, /=, %=

        int i = 2, j = 5;
        int exp1 = (i * j / i);
        int exp2 = (i * (j / i));
        System.out.println(exp1);
        System.out.println(exp2);

        // int x = 200, y = 50, z = 100;if(x > y && y > z){System.out.println("Hello");}if(z > y && z < x){System.out.println("Java");}if((y+200) < x && (y+150) < z){System.out.println("Hello Java");}

        //         In Java, an if block ends with } — you don’t need a ; after it.
        // Example:

        // if (x > y) { System.out.println("Hi"); }  // ✅ correct
        // if (x > y) { System.out.println("Hi"); }; // ❌ wrong

        int x, y, z;x = y = z = 2;x += y;y -= z;z /= (x + y);System.out.println(x + " " + y + " " + z);
    }
}