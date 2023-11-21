package basic_programs;

import java.util.Scanner;

public class ECC20_getFourPerLine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number to get natural numbers in that range");
        System.out.println("Enter a Number ");
        int num = sc.nextInt();
        System.out.println(getFourPerLine(num));
        sc.close();
    }

    public static String getFourPerLine(int num) {
        if (num < 0) return "-1";
        else if (num == 0) return "-2";
        else if (num > 99) return "-3";
        else {
            int i = 1;
            String result = "";
            while (i <= num) {
                result += i;
                if (i % 4 == 0) {
                    result += "\n";
                }else result+=" ";
                i++;
            }
            return result;
        }
    }
}
