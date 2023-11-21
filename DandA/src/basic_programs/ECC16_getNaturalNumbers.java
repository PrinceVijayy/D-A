package basic_programs;

import java.util.Scanner;

public class ECC16_getNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number to get natural numbers in that range");
        System.out.println("Enter Number One");
        int num1 = sc.nextInt();
        System.out.println("Enter Number Two");
        int num2 = sc.nextInt();

        System.out.println(getNaturalNumbers(num1, num2));
        sc.close();
    }
    public static String getNaturalNumbers(int num1, int num2){
        if(num1<0 ||num2<0) return "-1";
        else if(num1==0 ||num2==0) return "-2";
        else{
            String result="";
            while (num1<=num2){
                result+=num1+" ";
                num1++;
            }
            return result;
        }
    }
}
