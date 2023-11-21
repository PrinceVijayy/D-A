package JavaBasicPrograms;

import java.util.Scanner;

public class GreaterNumberOfThreeNumbers {
    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("We are finding the greater number of three numbers : ");
        System.out.println("Enter number A : ");
        a = sc.nextInt();
        System.out.println("Enter number B : ");
        b = sc.nextInt();
        System.out.println("Enter number C : ");
        c = sc.nextInt();
        // a = 5, b = 2, c = 3
        if (a > b) {
            if (a > c) {
                System.out.println("The greater number of three numbers is : " + a);
            }
        } else if (b > c) {
            if (b > a) {
                System.out.println("The greater number of three numbers is : " + b);
            }
        } else if (c > a) {
            if (c > b) {
                System.out.println("The greater number of three numbers is : " + c);
            }
        }
    }
}
