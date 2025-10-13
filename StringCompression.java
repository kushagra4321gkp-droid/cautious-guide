public class StringCompression {
    // public static String strCompression(String str){
    //     StringBuilder sb = new StringBuilder("");
    //     sb.append(str.charAt(0));
    //     int count = 1;
    //     for(int i = 0; i<str.length()-1; i++){
    //         if(str.charAt(i) == str.charAt(i+1)){
    //             count++;
    //         }else{
    //             sb.append(count);
    //             sb.append(str.charAt(i+1));
    //             count = 1;
    //         }
    //     }
    //     sb.append(count);
    //     return sb.toString();
    // }

    public static String mamsLogic(String str){
        StringBuilder sb = new StringBuilder("");
        for(int i = 0; i<str.length(); i++){
            int count = 1;
            sb.append(str.charAt(i));
            while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;
            }
            if(count > 1){
                sb.append(count);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        //String str = "abc";// here is the problem in string compression
        //String str = "aabcccc";
        String str = "abc";
        System.out.println(mamsLogic(str));
        //do leetcode 443;
    }
}