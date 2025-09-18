public class datatypes {
    public static void main(String args[]){
        byte b = 10;
        System.out.println(b);
        char ch = 'a';
        System.out.println(ch);
        boolean var = true;
        int a = 5;
        float f = 10.56f;
        // long -> for big int values
        // double -> for big float values
        short s = 100;
        System.out.println(var + "\n"+a +"\n"+f +"\n"+s);



        // FOR LEARNING PURPOSE


        //datatypes size and range

        // Perfect! 🚀 Let’s go through Java primitive datatypes with their size (in bits/bytes) and range (smallest to largest value).

        // 🔹 Java Primitive Data Types
        // Datatype	Size	Range
        // byte	8 bits (1 byte)	-128 to 127
        // short	16 bits (2 bytes)	-32,768 to 32,767
        // int	32 bits (4 bytes)	-2,147,483,648 to 2,147,483,647 (-2^31 to 2^31 - 1)
        // long	64 bits (8 bytes)	-9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 (-2^63 to 2^63 - 1)
        // float	32 bits (4 bytes)	~±3.4 × 10^38 (about 6–7 decimal digits precision)
        // double	64 bits (8 bytes)	~±1.7 × 10^308 (about 15–16 decimal digits precision)
        // char	16 bits (2 bytes)	0 to 65,535 (Unicode characters: 'a', 'A', '₹', '🙂', etc.)
        // boolean	JVM dependent (usually 1 bit, but often stored as 1 byte for efficiency)	true or false only
        // 🔑 Key Points

        // int is the default for integers.

        // double is the default for floating-point numbers.

        // float requires an f suffix → 10.5f.

        // long can have an L suffix → 10000000000L.

        // char uses Unicode, not ASCII only → can store symbols, emojis, etc.

        // boolean is just true or false (no numeric range).

    }
}