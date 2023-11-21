package basic_programs;

import java.util.ArrayList;

public class ECC41_getCollatzSequence {
    public static void main(String[] args) {
        System.out.println(getCollatzSequence(5));
    }

    public static String getCollatzSequence(int num) {
        if (num < 0) return "Error";
        else {
            StringBuilder str = new StringBuilder();
            while (num > 1) {
                if (num % 2 == 0) {
                    num /= 2;
                    str.append(num).append(" ");
                } else {
                    num = (num * 3) + 1;
                    str.append(num).append(" ");
                }
            }
            return String.valueOf(str);
        }
    }
}
