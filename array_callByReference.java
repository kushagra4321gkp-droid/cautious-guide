public class array_callByReference {

    public static void update(int marks[], int nonChangable){

        nonChangable = 10;

        for(int i = 0; i<marks.length; i++){
            marks[i] = marks[i] + 1;
        }
    }

    public static void main(String[] args) {
        int marks[] = {7, 8, 9};

        int nonChangable = 5;

        update(marks, nonChangable);
        
        for(int i = 0; i<marks.length; i++){
            System.out.print(marks[i] + " ");
        }

        System.out.println();

        System.out.println(nonChangable);
    }
}