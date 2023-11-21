package basic_programs;

import java.util.Scanner;

public class ECC9_findSign {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number to find Sign of the number");
        int num = sc.nextInt();
        System.out.println(findSign(num));
        sc.close();
    }

    public static int findSign(int num) {
        if (num < 0) {
            return -1;
        } else if (num == 0) {
            return 0;
        } else return 1;
    }
}
