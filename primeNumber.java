import java.util.*;

public class primeNumber{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number : ");
        int num = sc.nextInt();
        // int i = 2;
        // while(i<num){
        //     if (num%i==0){
        //         System.out.print("not prime");
        //         break;
        //     }
        //     i++;
        // }
        // System.out.println("prime");

        if(num==2){
            System.out.println("prime");
        }else{
            boolean is_prime = true;
            for(int i = 2; i<=Math.sqrt(num); i++){
                if(num%i==0){
                    is_prime = false;
                }
            }

            if(is_prime == true){
                System.out.println(num + " is prime");
            }else{
                System.out.println(num + " is not prime");
            }
        }

    }
}