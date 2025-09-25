import java.util.*;

public class usingContinue{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.print("enter number : ");
            int user = sc.nextInt();
            if (user % 10 == 0){
                continue;
            }else if (user == -1){
                break;
            }
            System.out.println("the number is : "+user);
        }
    }
}