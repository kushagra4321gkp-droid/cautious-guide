public class ternary_Operator{
    public static void main(String args[]){
        int largest = (5>3)? 5:3;
        System.out.println(largest);

        boolean truth = (true)? true:false;
        System.out.println(truth);

        boolean truth1 = (7<3)? true:false;
        System.out.println(truth1);

        String type = (5%2==0)?"even":"odd";
        System.out.println(type);
    }
}