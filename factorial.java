import java.util.*;

public class factorial{

    public static int calculateFact(int n){
        int fact = 1;
        for(int i = 1; i<=n; i++){
            fact *= i;
        }
        return fact;
    }

    public static int calculatenCr(int n, int r){
        return calculateFact(n) / (calculateFact(r) * calculateFact(n-r));
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        //int num = sc.nextInt();
        //int factorial = calculateFact(num);
        //System.out.println("factorial is : " + factorial);

        //Calculating BINOMIAL COEFFICIENT
        //Formula : C(n, r), is nCr = n! / (r! * (n - r)!)

        System.out.print("enter n : ");
        int n = sc.nextInt();
        System.out.print("enter r : ");
        int r = sc.nextInt();
        long nCr = calculatenCr(n, r);
        System.out.println("binomial cofficient is : " + nCr);



    }
}