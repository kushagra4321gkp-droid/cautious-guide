public class String_Comparision {

    public static String substring(String str, int si, int ei){
        String string1 = "";
        for(int i = si; i<ei; i++){
            string1 += str.charAt(i);
        }
        return string1;
    }

    //Use StringBuilder (or StringBuffer if thread-safe needed)

    //     So what’s happening under the hood?

    // Each string1 += ... line creates:

    // A new String object

    // Copies the old string contents + the new character into it

    // Discards the old string (waiting for GC)

    // ⚙️ Time Complexity

    // For each iteration, copying happens — that’s O(n) per concatenation.

    // So, if you’re concatenating n times, the total cost is:

    // 𝑂
    // (
    // 1
    // +
    // 2
    // +
    // 3
    // +
    // .
    // .
    // .
    // +
    // 𝑛
    // )
    // =
    // 𝑂
    // (
    // 𝑛
    // 2
    // )
    // O(1+2+3+...+n)=O(n
    // 2
    // )

    // So yes — time complexity is quadratic.
    // For something like 100,000 concatenations — it’s very slow.

    public static void main(String[] args) {
        // String s1 = "Tony";
        // String s2 = "Tony";
        // String s3 = new String("Tony");

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
        // if(s1.equals(s3)){
        //     System.out.println("s1 and s3 are equal");
        // }else{
        //     System.out.println("not equal");
        // }

        String str = "Hello World";
        System.out.println(substring(str, 1, 5));

        System.out.println(str.intern());
        str.intern();

    }

}