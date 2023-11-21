package JavaBasicPrograms;

import java.util.Scanner;

public class SwappingWithTemp {
    public static void main(String[] args) {
        int a, b;
        int temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("We are performing swapping of two numbers : ");
        System.out.println("Enter number A : ");
        a=sc.nextInt();
        System.out.println("Enter number B : ");
        b= sc.nextInt();
        System.out.println("The numbers before swapping are A : "+a+" and B : "+b);
        temp = a;
        a=b;
        b=temp;
        System.out.println("The numbers after swapping are A : "+a+" and B : "+b);
    }
}
