import java.util.Scanner;

public class ECC10_isEvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number to find even or odd");
        int num = sc.nextInt();
        System.out.println(isEvenOrOdd(num));
        sc.close();
    }

    public static String isEvenOrOdd(int num) {
        if (num == 0) {
            return "Invalid Input";
        } else if (num % 2 == 0) {
            return "Even";
        } else return "Odd";
    }

}
