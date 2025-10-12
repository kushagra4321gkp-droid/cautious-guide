public class largestString {
    public static String largestStr(String fruits[]){
        String largest = fruits[0];
        for(int i = 1; i<fruits.length-1; i++){
            if(fruits[i].compareToIgnoreCase(fruits[i+1]) > 0){
                largest = fruits[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        String fruits[] = {"apple", "mango", "banana"};
        System.out.print("largest string is : " + largestStr(fruits));
    }
}