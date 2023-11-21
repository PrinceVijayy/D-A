package JavaBasicPrograms;

import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("We are finding the given number is prime or not");
        System.out.println("Enter a number : ");

        int num = sc.nextInt();

        // Def : A number is said to be a prime number if it is only divisible by 1 and itself

        int count =0;

        if(num <= 1){
            System.out.println(" The input should be greater than 1 ");
            System.exit(0);
        }

        for (int i = 1; i <= num; i++) {
            if(num % i == 0){
                count ++;
            }
        }
        if(count == 2){
            System.out.println("The given number : "+num+" is a prime number.");
        }else{
            System.out.println("The given number : "+num+" is not a prime number.");
        }

    }
}
