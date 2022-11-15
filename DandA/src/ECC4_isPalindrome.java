import java.util.Scanner;

public class ECC4_isPalindrome {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number to find it is palindrome or not");
    int num = sc.nextInt();
    System.out.println(isPalindrome(num));
  }

  public static int isPalindrome(int num) {
    if (num <= 0) {
      return -1;
    } else if (num < 100 || num > 999) {
      return -2;
    } else {
      int dummy = num;
      int sum = 0;
      int reminder;
      int temp = 100;
      while (num > 0) {
        reminder = num % 10;
        sum += reminder * temp;
        num /= 10;
        temp /= 10;
      }
      if (dummy == sum) {
        return 1;
      } else return 0;
    }
  }
}
