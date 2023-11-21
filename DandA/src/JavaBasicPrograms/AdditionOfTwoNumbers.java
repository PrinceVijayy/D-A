package JavaBasicPrograms;

import java.util.Scanner;

public class AdditionOfTwoNumbers {
    public static void main(String[] args) {
        int a,b;
        int c;
        Scanner sc=new Scanner(System.in);
        System.out.println("We are performing addition of two numbers");
        System.out.println("Enter number A : ");
        a=sc.nextInt();
        System.out.println("Enter number B : ");
        b=sc.nextInt();
        c=a+b;
        System.out.println("The sum of two numbers A and  B is : "+c);
    }
}
