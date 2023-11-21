package basic_programs;

public class ECC33_getPrimeNumbers {
    public static void main(String[] args) {
        System.out.println(getPrimeNumbers(3, 15));
    }

    //        public static String getPrimeNumbers(int start, int end) {
//        if (start < 0 || end < 0) return "-1";
//        else if (start >= end) return "-2";
//        else {
//            StringBuilder str = new StringBuilder();
//            for (int i = start; i <= end; i++) {
//                int count = 0;
//                for (int j = 2; j < i; j++) {
//                    if (i % j == 0) count++;
//                }
//                if (count == 0) {
//                    str.append(i).append(" ");
//                }
//            }
//            return String.valueOf(str);
//        }
//    }
    //Alternative
    public static boolean checkPrime(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static String getPrimeNumbers(int start, int end) {
        if (start < 0 || end < 0) return "-1";
        else if (start >= end) return "-2";
        else {
            StringBuilder str = new StringBuilder();
            for (int i = start; i <= end; i++) {
                if (checkPrime(i)) str.append(i).append(" ");
            }
            return String.valueOf(str);
        }
    }
}
