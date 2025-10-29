//we use Backtracking for Three purposes --> (1)Decision (2)Optimization (3)Enumeration 
//Let's take an Example of Grid --> It is like a Matrix. it's first cell is at position (0,0) and it's last cell is at position (n-1,n-1). So we have to reach to the destination, so we have a question. Is there any path from the Source (0,0) to the Destination (n-1,n-1)?. So it's a Yes/No type question. It's like Decision we take that is there any path exist or not.

//Secondly, we have optimization which is like finding the shortest path between the Source and destination.

//Thirdly we have Enumeration which is about total number of ways to reach to the Drstination from Source. Now Generally it means that totla number of possible Solutions to the problem.

public class BackTrackingArrays {

    public static void printArr(int arr[]){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    // public static void backtrack(int arr[], int j){
    //     //base case 
    //     if(j==arr.length){
    //         printArr(arr);
    //         return;
    //     }

    //     //kaam
    //     arr[j] = j+1;

    //     //inner calls
    //     backtrack(arr, j+1);

    //     //while backtrack / backtracking step
    //     arr[j] = arr[j] -2;

    // }


    public static void backtrack(int arr[], int j){
        //base case 
        if(j==arr.length){
            printArr(arr);
            return;
        }

        //recursion
        arr[j] = j+1;
        backtrack(arr, j+1); //fnx call step
        arr[j] = arr[j] -2; //backtracking step

        //***Function call ke baad wala step hamara Backtracking ka step hota hai */

        //While going up in the call stack, i did commit some changes in my array and because of those changes, in base case our array used to look like this --> 1 2 3 4 5.
        //and when i returned from my base case, so inside main, after end of recursion, my array looks like this --> -1 0 1 2 3 --> this result is because of Backtracking.
        //Backtracking means when you perform some function after comming back from call stack(recursion) 
        //TC is O(2n) --> O(n)
        //SC is O(n) --> which is because of n call stacks.
        //And since we know that we take auxillary space as the input function of Space Complexity so it is because of call stack ,i.e, O(n).

    }

    public static void main(String[] args) {
        int j = 0;
        int arr[] = new int[5];
        backtrack(arr, j);
        System.out.println();
        printArr(arr);

    }
}