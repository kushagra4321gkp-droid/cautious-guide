public class loopsVSconditionals{
    public static void main(String args[]){
        int Final = 0;

        // if (Final<3) {
        //     System.out.println("Hello");
        //     Final += 1;
        // }
        // System.out.println("Final = " + Final);

        while (Final<3) {
            System.out.println("Hello");
            Final += 1;
        }

        System.out.println("Final = " + Final);
    }
}