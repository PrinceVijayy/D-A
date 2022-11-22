import java.util.Scanner;

public class ECC4_isPalindrome {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number to find it is palindrome or not");
    int num = sc.nextInt();
    System.out.println(isPalindrome(num));
    sc.close();
  }

  public static int isPalindrome(int num) {
    if (num <= 0) {
      return -1;
    } else if (num < 100 || num > 999) {
      return -2;
    } else {
      int dummy = num;
      int result = 0;
      int reminder;
      while (num > 0) {
        reminder = num % 10;
        result=result*10+reminder;
        num /= 10;
      }
      if (dummy == result) {
        return 1;
      } else return 0;
    }
  }
}
