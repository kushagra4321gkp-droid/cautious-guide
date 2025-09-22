public class type_promotion{
    public static void main(String args[]){

        char a = 'a';
        char b = 'b';
        int c = a-b; // ✅ promoted to int
        System.out.println(c);

        byte ba = 10;
        byte bb = 20;
        byte bc = (byte)(a + b); // ❌ error, because a+b becomes int
        // int c = a + b;     // ✅ promoted to int
        System.out.println(bc);

        


    }
}