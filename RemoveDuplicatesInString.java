public class RemoveDuplicatesInString {
    public static void main(String[] args) {
        String givenString = "appnnacollege";
        StringBuilder newStr = new StringBuilder("");
        // int map[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        boolean map[] = new boolean[26];
        int i = 0;
        duplicateRemover(givenString, map, newStr, i);
        System.out.println(newStr.toString());
    }

    public static void duplicateRemover(String givenString, boolean map[], StringBuilder newStr, int i){
        if (i == givenString.length()) {
            return;
        }

        char currentChar = givenString.charAt(i);
        int index = currentChar - 'a';

        if (map[index] == false) {
            newStr.append(currentChar);
            map[index] = true;
        }   
        duplicateRemover(givenString, map, newStr, i+1);
        
    }
}
