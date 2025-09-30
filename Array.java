import java.util.*;

public class Array {
    public static void main(String[] args) {

        int arr[] = new int[50];

        System.out.println(arr + "\n"); //[I → means array of integers (int[]) and @59717824 → is the memory address hash of the array (not the actual numbers inside it)

        System.out.println(Arrays.toString(arr));  // prints all elements

        //taking input in an array
        Scanner sc = new Scanner(System.in);
        arr[0] = sc.nextInt();
        arr[1] = sc.nextInt();
        arr[2] = sc.nextInt();

        //printing output of array
        System.out.println("marks of phy : " + arr[0]);
        System.out.println("marks of math : " + arr[1]);
        System.out.println("marks of chem : " + arr[2]);

        //updating an element in an array
        arr[0] = arr[0] + 1;
        System.out.println("marks of phy : " + arr[0]);

        //finding out length of an array
        System.out.println(arr.length);

        System.out.println(arr.getClass().getName());
    }
}