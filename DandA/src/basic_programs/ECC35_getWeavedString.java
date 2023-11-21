package basic_programs;

public class ECC35_getWeavedString {
    public static void main(String[] args) {
        System.out.println(getWeavedString("hello","hello"));
    }

    public static String getWeavedString(String str1, String str2) {
        if (str1.isEmpty() || str2.isEmpty()) return "-1";
        else if (str1.length() > str2.length()) return str2 + "+" + str1 + "+" + str2;
        else if (str1.length() < str2.length()) return str1 + "+" + str2 + "+" + str1;
        else {
            StringBuilder result=new StringBuilder();
            for(int i=0;i<str1.length();i++){
                result.append(str1.charAt(i)).append(str2.charAt(i));
            }
            return String.valueOf(result);
        }
    }
}
