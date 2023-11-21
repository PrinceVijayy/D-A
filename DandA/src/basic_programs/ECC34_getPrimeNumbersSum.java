package basic_programs;

public class ECC34_getPrimeNumbersSum {
    public static void main(String[] args) {
        System.out.println(getPrimeNumbersSum(3, 5));
    }
    public static boolean checkPrime(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static int getPrimeNumbersSum(int start, int end) {
        if (start < 0 || end < 0) return -1;
        else if (start >= end) return -2;
        else {
            int result=0;
            for (int i = start; i <= end; i++) {
                if (checkPrime(i)) result+=i;
            }
            return result;
        }
    }
}
