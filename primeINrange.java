import java.util.*;

public class primeINrange {

    public static void primeInRangeGenerator(int n){
        for(int i=2; i<=n; i++){
            for(int j = 2; j<i; j++){
                if(i%j!=0){
                    System.out.println(i);
                }
            }
        }
    }

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       primeInRangeGenerator(n); 
    }
}