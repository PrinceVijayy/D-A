package recursion;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println(reverseString("vijay"));
    }

    static String reverseString(String word) {
        if (word.length() == 0) {
            return "";
        } else {
            return word.substring(word.length()-1) + reverseString(word.substring(0,word.length() - 1));
        }
    }
}
