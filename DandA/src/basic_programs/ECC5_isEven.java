package basic_programs;

import java.util.Scanner;

public class ECC5_isEven {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number to find it is even or not");
    int num = sc.nextInt();
    System.out.println(isEven(num));
    System.out.println(isEven(124)); // even
    System.out.println(isEven(445)); // odd
    System.out.println(isEven(-44)); // negative
    System.out.println(isEven(0)); // zero
    sc.close();
  }

  public static int isEven(int num) {
    if (num <= 0) {
      return -1;
    } else if (num % 2 == 0) return 1;
    else return 0;
  }
}
