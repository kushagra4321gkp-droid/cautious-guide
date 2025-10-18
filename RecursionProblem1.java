public class RecursionProblem1 {
    public static void main(String[] args) {
        //Recursion r = new Recursion();
        //r.decreasingOrder(5);
        System.out.println(factorial(5));

        System.out.println("Sum of First n NN is : " + SumOfFirstn(5) );
    }


public static int factorial(int n){
    if(n==1){
        return 1;
    }
    return n * factorial(n-1);
}

public static int SumOfFirstn(int n){
    if(n == 1){
        return 1;
    }
    return n + SumOfFirstn(n-1);
}

// class Recursion{
//     void decreasingOrder(int n){
//         // if(n==0){
//         //     return;
//         // }
//         // decreasingOrder((n-1));
//         // System.out.println(n);

//         System.out.println(n);
//         if(n==0){
//             return;
//         }
//         decreasingOrder(n-1);
        
//     }
}
