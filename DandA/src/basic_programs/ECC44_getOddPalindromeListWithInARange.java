package basic_programs;

public class ECC44_getOddPalindromeListWithInARange {
    public static void main(String[] args) {
        System.out.println(getPalindromeList(100,200));
    }

    public static String getPalindromeList(int num1, int num2) {
        if ((num1 < 100 || num1 > 999)||(num2 < 100 || num2 > 999)|| num1>num2 ) return "Error";
        else {
            String str = "";
            for(int i=num1;i<=num2;i++){
                if(reverseNumber(i)==i){
                    str+=i+", ";
                }
            }
            return str;
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
