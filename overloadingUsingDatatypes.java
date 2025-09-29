public class overloadingUsingDatatypes {

    public static int sum(int a, int b){
        return a + b;
    }

    public static float sum(float a, float b){
        return a + b;
    }

    public static void checkPrime(int n){
        boolean isPrime = true;
        if(n==2){
            System.out.println("prime");
        }else{
            for(int i = 2; i<n; i++){
            if(n%i==0){
                isPrime = false;
                break;
            }
            }  
            if(isPrime == true){
                System.out.print("prime");
            }else{
                System.out.println("not prime");
            }  

        }
    }

    public static void main(String[] args) {
        //System.out.println(sum(3, 5));
        //System.out.println(sum(3.2f, 4.8f));

        checkPrime(11);
    }
}
