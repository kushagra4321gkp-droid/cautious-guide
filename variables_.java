class variables_ {
    public static void main(String args[]){
        int a = 10;
        int b = 5;
        System.out.println(a);

        //Use int (or String, etc.) only once when you first declare the variable.
        //After that, just use assignment (a = ...;) to change its value.
        // int a = 50; 
        // System.out.println(a);

        a = 50;
        System.out.println(a);

        a = b;
        System.out.println(a);










        

        // LEARN FILE HANDLING

        // Normally, Java variables only live in RAM while the program is running. If you want data to stay permanently between program runs, you need persistence — storing it in a file or database.

        // 🔹 Option 1: Store in a File (Simple way)

        // Here we use FileWriter to save user input to a text file and then read it later.

        // import java.io.*;
        // import java.util.Scanner;

        // public class SaveDataExample {
        //     public static void main(String[] args) throws IOException {
        //         Scanner sc = new Scanner(System.in);

        //         // Take input
        //         System.out.print("Enter your name: ");
        //         String name = sc.nextLine();

        //         // Save data to file
        //         FileWriter fw = new FileWriter("data.txt", true); // true = append mode
        //         fw.write(name + "\n");
        //         fw.close();

        //         // Read data from file
        //         System.out.println("\n--- All Saved Data ---");
        //         BufferedReader br = new BufferedReader(new FileReader("data.txt"));
        //         String line;
        //         while ((line = br.readLine()) != null) {
        //             System.out.println(line);
        //         }
        //         br.close();
        //     }
        // }

        // ▶ Example run:

        // Run 1 → Input: Kushagra → File stores it.

        // Run 2 → Input: Ravi → File now has:

        // Kushagra
        // Ravi


        // So now data stays permanently.

        // 🔹 Option 2: Store in a Database (Advanced way)

        // If you need structured data (like name, age, etc.), you’d use a database (e.g., MySQL, SQLite). But for learning, file storage is enough.

        // ✅ Summary:

        // Without persistence → old data is lost after the program ends.
        // With persistence → you can store it in a file or database and reload it next time
    }
}