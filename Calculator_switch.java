import java.util.*;

public class Calculator_switch{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        double operand1 = sc.nextDouble();
        System.out.println("Enter the second number : ");
        double operand2 = sc.nextDouble();
        System.out.println("Enter the operator : ");
        char operation = sc.next().charAt(0);
        switch(operation){
            case '+': System.out.println("The result : " + (operand1 + operand2));
                    break;
            case '-': System.out.println("The result : " + (operand1 - operand2));
                    break;
            case '*': System.out.println("The result : " + (operand1 * operand2));
                    break;
            case '/': System.out.println("The result : " + (operand1 / operand2));
                    break;
            default : System.out.println("Enter valid operation");        

        }

    }
}