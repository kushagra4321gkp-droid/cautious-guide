import java.util.*;

public class usingBreak{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        while(true){
            int user = sc.nextInt();
            if (user % 10 == 0){
                break;
            }
            System.out.println(user + "  ");
        }
    }
}