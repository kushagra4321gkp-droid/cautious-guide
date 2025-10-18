public class FibonacciUsingRecursion {

    public static int fibo(int n){
    if(n == 0){
        return 0;
    }
    if(n == 1){
        return 1;
    }
    n = fibo(n-1) + fibo(n-2);
    return n;
    } 

    public static void main(String[] args) {
        System.out.println(fibo(2));
    }
}

