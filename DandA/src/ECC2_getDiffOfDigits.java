import java.util.Scanner;

public class ECC2_getDiffOfDigits {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your number to find Diff of Digits");
    int num = sc.nextInt();
    System.out.println(getDiffOfDigits(num));
    System.out.println(getDiffOfDigits(45));
    System.out.println(getDiffOfDigits(-44));
    System.out.println(getDiffOfDigits(104));
    System.out.println(getDiffOfDigits(8));
    sc.close();
  }

  public static int getDiffOfDigits(int num) {
    if (num >= 20 && num <= 99) {
      int number_in_second_position = num % 10;
      int number_in_first_position = num / 10;
      return number_in_first_position-number_in_second_position;
    } else if(num<0) {
      return -3;
    }else if (num>99){
      return -2;
    }else return -1;
  }
}
