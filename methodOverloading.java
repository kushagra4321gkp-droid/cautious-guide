public class methodOverloading{

    public static int sum(int a, int b){
        System.out.println("sum with 2 param executed");
        return a + b;
    }

    public static int sum(int a, int b, int c){
        System.out.println("sum with 3 param executed");
        return a + b + c;
    }

    public static int sum(int a, int b, int c, int d){
        System.out.println("sum with 4 param executed");
        return a + b + c + d;
    }

    public static void main(String args[]){
        //method overloading
        int sum1 = sum(3,4);
        System.out.println(sum1);
        int sum2 = sum(1, 3, 7, 3);
        System.out.println(sum2);

    }
}