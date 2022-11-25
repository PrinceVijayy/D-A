/**
 * If the input is a multiple of 3 return "FIZZ" (Ex:- Input 33 output FIZZ)
 * If the input is a multiple of 5 return "BIZZ" (Ex:- Input 5 output BIZZ)
 * If the input is a multiple of 3 and 5 return "FIZZBIZZ" (Ex:- Input 15 output FIZZBIZZ)
 * if the input is not a multiple of 3 or 5, return the number itself in the form of string 
 * If the given value is negative or zero, return "Error";
 */
public class ECC42_getFizzBizz {
    public static void main(String[] args) {
        System.out.println(getFizzBizz(5));
        System.out.println(getFizzBizz(33));
        System.out.println(getFizzBizz(15));
        System.out.println(getFizzBizz(2));
        System.out.println(getFizzBizz(-2));
    }

    public static String getFizzBizz(int num) {
        if (num<0) return "Error";
        else if (num%3==0 && num%5==0) return "FIZZBIZZ";
        else if (num%3==0) return "FIZZ";
        else if(num%5==0) return "BIZZ";
        else return String.valueOf(num);
    }
}
