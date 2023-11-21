package basic_programs;

import java.util.Scanner;

public class ECC19_getNumbersInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number to get natural numbers in that range");
        System.out.println("Enter Number One");
        int num1 = sc.nextInt();
        System.out.println("Enter Number Two");
        int num2 = sc.nextInt();
        System.out.println("Enter increment number");
        int increment = sc.nextInt();
        System.out.println(getNumbersInRange(num1, num2, increment));
        sc.close();
    }

    public static String getNumbersInRange(int num1, int num2, int increment) {
        if (num1 < 0 || num2 < 0 || increment < 0) return "-1";
        else if (num1 == num2) return "-2";
        else if (num1 > num2) return "-3";
        else {
            String result = "";
            int start = num1 + 1;
            int end = num2;
            while (start < end) {
                result += start + " ";
                start = start + increment;
            }
            return result;
        }
    }
}
