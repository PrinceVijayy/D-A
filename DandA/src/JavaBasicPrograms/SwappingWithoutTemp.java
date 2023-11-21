package JavaBasicPrograms;

import java.util.Scanner;

public class SwappingWithoutTemp {
    public static void main(String[] args) {
        int a,b;
        Scanner sc =new Scanner(System.in);
        System.out.println("We are performing swapping two numbers without using temp : ");
        System.out.println("Enter number A : " );
        a=sc.nextInt();
        System.out.println("Enter number B : ");
        b=sc.nextInt();
        System.out.println("Numbers before swapping A : "+a+" B : "+b);
        // a = 2 ,b = 3
        a=a+b; // a = 5
        b=a-b; // b = 5 - 3 = 2
        a=a-b; // a = 5 - 2 = 3
        System.out.println("Numbers after swapping A : "+a+" B : "+b);
    }
}
