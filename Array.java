import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        
        int arr[] = new int[50];

        System.out.println(arr + "\n"); //[I → means array of integers (int[]) and @59717824 → is the memory address hash of the array (not the actual numbers inside it)

        System.out.println(Arrays.toString(arr));  // prints all elements
    }
}