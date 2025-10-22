public class OptimizedPower {
    public static void main(String[] args) {
        System.out.println(optimizedPower(2, 9));
    }

    public static int optimizedPower(int x, int n){
        if(n == 0) return 1;
        if(n == 1){
            return x;
        }
        if(n % 2 == 0){
            return optimizedPower(x, n/2) * optimizedPower(x, n/2);
        }else{
            return x * optimizedPower(x, n/2) * optimizedPower(x, n/2);
        }
    }
}
