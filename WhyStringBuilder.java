public class WhyStringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb.getClass());
        //sb.toString();
        System.out.println(sb.getClass());
        System.out.println(sb.toString().getClass());//this will work.
            // toString() does not modify the original object.
            // It returns a new String object that contains the same text representation.

        
    }
}