package basic_programs;

import java.util.Scanner;

public class ECC11_calculate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number to find even or odd");
        int num = sc.nextInt();
        System.out.println(calculate(num));
        sc.close();
    }

    public static int calculate(int num) {
        if (num <= 0) {
            return -1;
        } else if (num % 2 == 0) {
            return num * num;
        } else return num * num * num;
    }

}
