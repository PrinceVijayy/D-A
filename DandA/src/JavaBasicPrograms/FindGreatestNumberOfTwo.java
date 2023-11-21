package JavaBasicPrograms;

import java.util.Scanner;

public class FindGreatestNumberOfTwo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("We are finding the greatest number of two : ");
        System.out.println("Enter number A : ");
        int a = sc.nextInt();
        System.out.println("Enter number B : ");
        int b = sc.nextInt();
        if(a>b){
            System.out.println("A is the greatest number");
        } else if (a < b) {
            System.out.println("B is the greatest number");
        }else{
            System.out.println("A and B are equal");
        }
    }
}
