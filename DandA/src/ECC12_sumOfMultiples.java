import java.util.Scanner;

public class ECC12_sumOfMultiples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 3 number to find sum of multiples");
        System.out.println("Enter first number");
        int num1 = sc.nextInt();
        System.out.println("Enter second number");
        int num2 = sc.nextInt();
        System.out.println("Enter third number");
        int num3 = sc.nextInt();
        System.out.println(sumOfMultiples(num1, num2, num3));
    }

    public static int sumOfMultiples(int num1, int num2, int num3) {
        if (num1 <= 0 || num2 <=0 ||num3 <= 0){
            return -1;
        }else{
            num1=num1/10*10+10;
            num2=num2/10*10+10;
            num3=num3/10*10+10;
            return num1+num2+num3;
        }
    }
}
