public class WhyStringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb.getClass());
        //sb.toString();
        System.out.println(sb.getClass());
        System.out.println(sb.toString().getClass());//this will work.
            // toString() does not modify the original object.
            // It returns a new String object that contains the same text representation.

        //A mini program using StringBuilder
        StringBuilder Sb = new StringBuilder("");
        for(char ch = 'a'; ch<='z'; ch++){
            Sb.append(ch);
        }
        System.out.println();
        System.out.print(Sb + "\n");
        System.out.println(Sb.length());
    }
}

//Concept
// Analogy

// Think of it like this:

// String → a sealed letter: once written, can’t change; safe to pass around.

// StringBuilder → a notebook: you can write, erase, and change content quickly — but not safe to share until you “seal” it (toString()).