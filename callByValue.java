public class callByValue{

    public static void changeA(int a){
        a = 10;
    }

    public static void main(String args[]){
        int a = 5;
        changeA(a);
        System.out.println(a); //java's function always take copy of variable, not the actual value -> that's why this concept is called "CALL BY VALUE"

    }
}