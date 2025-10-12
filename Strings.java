import java.util.*;
public class Strings {
    public static void printLetters(String str){
        for(int i = 0; i<str.length(); i++){
            System.out.print(str.charAt(i) + " ");
        }
    }
    public static void main(String[] args) {
        // char arr[] = {'a', 'b', 'c', 'd'};
        // String str = "abcd";
        // String str1 = new String("xys");
        // System.out.println(str + " " +  arr + " " +  str1);

        // Scanner sc = new Scanner(System.in);
        // String name = sc.nextLine();
        // System.out.print(name);

        // String fullName = "Tony Stark";
        // System.out.println(fullName.length());

        //concatination
        String firstName = "Kushagra";
        String lastName = "Tiwari";
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);

        //To extract a character out of a String, we have a special function
        //System.out.println(lastName.charAt(0));

        printLetters(fullName);


    }
}