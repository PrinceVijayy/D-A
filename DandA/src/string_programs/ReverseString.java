package string_programs;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println(reverseStringAndNotSpeacialChars("sr@v@a#n"));
    }

    public static String reverseStringAndNotSpeacialChars(String str) {
        //char[] specialChars = {'@', '#'};
        Map<Integer, Character> strWithSpecialChars = new LinkedHashMap<>();

        StringBuilder strWithNoSpecialChars = new StringBuilder();

        char[] strCharArray = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            if (strCharArray[i] == '@' || strCharArray[i] == '#') {
                strWithSpecialChars.put(i, strCharArray[i]);
            } else {
                strWithNoSpecialChars.append(strCharArray[i]);
            }
        }
        strWithNoSpecialChars.reverse();
        char[] reversedStr = strWithNoSpecialChars.toString().toCharArray();
        List<Character> reverseStr=new ArrayList<>();
        for (char c:reversedStr) {
            reverseStr.add(c);
        }
        StringBuilder resultString = new StringBuilder();
        for (int i = 0, j = 0; i < str.length(); i++) {
            if (strWithSpecialChars.containsKey(i)) {
                reverseStr.add(i,strWithSpecialChars.get(i));
            }
        }
        reverseStr.forEach(resultString::append);
        return resultString.toString();
    }
}
