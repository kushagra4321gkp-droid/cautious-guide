import java.util.*;
public class OOPS_New {
    public void printNum(Scanner sc){
        int a = sc.nextInt();
        System.out.println(a);
    }
    //error: can't find main(String[]) method in class: OOPS_New
    //can't run cause jvm needs main() to enter the program
    //and when i entered 2, them it was the functionality of powershell which echoed the interger back!
    //✔ You can compile a program without main().
❌ But you cannot run it directly without main() (unless it’s invoked from another class that has one)

}
