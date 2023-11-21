package basic_programs;

public class ECC25_checkPalindrome {
    public static void main(String[] args) {
        System.out.println(checkPalindrome(2));
        System.out.println(checkPalindrome(121));
        System.out.println(checkPalindrome(16));
    }

    public static String checkPalindrome(int num) {
        if (num < 0) return "-1";
        else if (num <=9) return "-2";
        else {
            int dummy=num;
            int result=0;
            while (num>0){
                int reminder=num%10;
                result=result*10+reminder;
                num/=10;
            }
            if (result==dummy) return "true";
            else return "false";
        }
    }
}
