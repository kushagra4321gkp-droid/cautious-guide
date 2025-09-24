import java.util.*;

public class Switch_case{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        switch(day){
            case 1: System.out.println("Mondey");
                break;
            case 2: System.out.println("Tuesday");
                break;
            default : System.out.println("holiday");
        }
    }
}