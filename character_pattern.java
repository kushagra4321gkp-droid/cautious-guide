import java.util.*;

public class character_pattern{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter lines : ");
        int lines = sc.nextInt();
        char ch = 'A';
        for(int i = 1; i<=lines; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(ch + "  ");
                ch++;
            }
            System.out.println();
        }
    }
    // commited, not a good idea but i promise my self that i will comeback!
}
    