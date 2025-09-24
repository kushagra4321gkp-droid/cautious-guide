public class LargestOfThree{
    public static void main(String args[]){
        // int A = 1;
        // int B = 3;
        // int C = 6;

        int A = 9;
        int B = 8;
        int C = 98;
        // IT WORKS ONLY WHEN A IS NOT GREATER THAN B
        // if (A>B) {
        //     if (A>C) {
        //         System.out.println("A is largest");
        //     }
        // }else if (B>C) {
        //     System.out.println("B is largest");
        // }else {
        //     System.out.println("C is largest");
        // }

        // FOR ALL CASES
        if ((A>=B) && (A>=C)){
            System.out.println("A is largest");
        }else if (B>=C){
            System.out.println("B is largest");
        }else {
            System.out.println("C is largest");
        }

    }
}