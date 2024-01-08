package recursion;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(rev(1234));
        System.out.println(isPalindrome(131));
        System.out.println(isPalindrome(123));
    }

    private static int rev(int num) {
        int numberOfDigits = (int) Math.log10(num) + 1;
        return helper(num, numberOfDigits);
    }

    private static int helper(int num, int digits) {
        if (digits == 1) {
            return num;
        }
        int i = (num % 10) * (int) Math.pow(10, digits-1) + helper(num / 10, digits - 1);
        return i;
    }

    private static boolean isPalindrome(int num){
        return num == rev(num);
    }

}
