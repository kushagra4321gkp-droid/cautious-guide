import java.util.*;

public class overloadingUsingDatatypes {

    public static int sum(int a, int b){
        return a + b;
    }

    public static float sum(float a, float b){
        return a + b;
    }

    public static boolean checkPrime(int n){
        
        if(n==2){
            return true;
        }else{
            for(int i = 2; i<n; i++){
            if(n%i==0){
                return false;
                break;
            }
            }  
            if(isPrime == true){
                return true;
            }else{
                return false;
            }  

        }
    }

    public static void primeInRange(int n){
        for(int i = 2; i<=n; i++){
            if(checkPrime(i) == 'prime'){
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        //System.out.println(sum(3, 5));
        //System.out.println(sum(3.2f, 4.8f));

        //checkPrime(11);

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        primeInRange(n);
    }
}
