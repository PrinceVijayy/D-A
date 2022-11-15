import java.util.Scanner;

public class ECC13_sumOfRoundedValues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 3 number to find sum of multiples");
        System.out.println("Enter first number");
        int num1 = sc.nextInt();
        System.out.println("Enter second number");
        int num2 = sc.nextInt();
        System.out.println("Enter third number");
        int num3 = sc.nextInt();
        System.out.println(sumOfRoundedValues(num1, num2, num3));
    }

    public static int sumOfRoundedValues(int num1, int num2, int num3) {
        if (num1 <= 0 || num2 <= 0 || num3 <= 0) {
            return -1;
        } else {
            if (num1 % 10 < 5) {
                num1 = num1 / 10 * 10;
            } else {
                num1 = num1 / 10 * 10 + 10;
            }
            if (num2 % 10 < 5) {
                num2 = num2 / 10 * 10;
            } else {
                num2 = num2 / 10 * 10 + 10;
            }
            if (num3 % 10 < 5) {
                num3 = num3 / 10 * 10;
            } else {
                num3 = num3 / 10 * 10 + 10;
            }
            return num1 + num2 + num3;
        }
    }
}
