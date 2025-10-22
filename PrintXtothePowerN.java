public class PrintXtothePowerN {
    public static void main(String[] args) {
        int x = 3, n = 10;
        System.out.println(X_toThePower_N(x, n));
    }

    public static int X_toThePower_N(int x, int n){
        if(n == 1){
            return x;
        }
        return x * X_toThePower_N(x, n-1);
    }
}
