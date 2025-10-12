public class palinDrome {
    public static boolean checkPalindrome(String st){
        int j = st.length()-1;
        for(int i = 0; i<st.length()/2; i++){
            if(st.charAt(i) == st.charAt(j)){
                j--;
            }else{
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String st = "madam";
        System.out.print(checkPalindrome(st));
    }
}