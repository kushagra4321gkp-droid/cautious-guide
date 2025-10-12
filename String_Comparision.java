public class String_Comparision {
    public static void main(String[] args) {
        String s1 = "Tony";
        String s2 = "Tony";
        String s3 = new String("Tony");

        // if(s1 == s2){
        //     System.out.println("Strings are equal");
        // }else{
        //     System.out.println("Strings are not equal");
        // }

        // if(s1 == s3){
        //     System.out.println("Strings are equal");
        // }else {
        //     System.out.println("Strings are not equal");
        // }

        //We don't compare two Strings using '==' operator, because it checks string equality on the object level that yes s1 and s1 both are pointing to a same object but for s3 we have created a new object in the Heap Memory!

        //correct way to compare two Strings by value
        if(s1.equals(s3)){
            System.out.println("s1 and s3 are equal");
        }else{
            System.out.println("not equal");
        }
    }
}