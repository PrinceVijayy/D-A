package Assignment;

public class ECC24_checkPrime {
    public static void main(String[] args) {
        System.out.println(checkPrime(2));
        System.out.println(checkPrime(121));
        System.out.println(checkPrime(16));
    }

    public static String checkPrime(int num) {
        if (num < 0) return "-1";
        else if (num == 0 || num == 1) return "-2";
        else {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    return "false";
                }
            }
            return "true";
        }
    }
}
