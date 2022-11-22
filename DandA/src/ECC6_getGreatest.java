import java.util.Scanner;

public class ECC6_getGreatest {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter two numbers to find greatest number");
    System.out.println("Enter number one");
    int num1 = sc.nextInt();
    System.out.println("Enter number two");
    int num2 = sc.nextInt();
    System.out.println(getGreatest(num1, num2));
    System.out.println(getGreatest(124, 234)); // valid values
    System.out.println(getGreatest(132, -34)); // negative
    System.out.println(getGreatest(-44, 123)); // negative
    System.out.println(getGreatest(0, 134)); // zero
    sc.close();
  }

  public static int getGreatest(int num1, int num2) {
    if (num1 < 0 || num2 < 0) return -1;
    else if (num1 == 0 || num2 == 0) return -2;
    else if (num1 > num2) return num1;
    else if (num2 > num1) return num2;
    else return 0;
  }
}
