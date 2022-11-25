package Assignment;

public class ECC43_getPalindromeList {
    public static void main(String[] args) {
        System.out.println(getPalindromeList(165));
    }

    public static String getPalindromeList(int num) {
        if (num < 100 || num > 999) return "Error";
        else {
            boolean result = true;
            int count = 0;
            StringBuilder str = new StringBuilder();
            while (result) {
                if (reverseNumber(num) == num) {
                    str.append(num);
                    result = false;
                } else {
                    if (count == 10) result=false;
                    int reversedNumber = reverseNumber(num);
                    str.append(num).append(", ").append(reversedNumber).append(", ");
                    num += reversedNumber;
                    count++;
                }
            }
            return String.valueOf(str);
        }

    }

    public static int reverseNumber(int num) {
        int result = 0;
        while (num > 0) {
            int reminder = num % 10;
            result = result * 10 + reminder;
            num /= 10;
        }
        return result;

    }
}
