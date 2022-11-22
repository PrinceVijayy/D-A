public class ECC28_getFactors {
    public static void main(String[] args) {
        System.out.println(getFactors(28));
    }

    public static String getFactors(int n) {
        if (n < 0) return "-1";
        else if (n == 0) return "-2";
        else {
            StringBuilder str = new StringBuilder();
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) str.append(i + " ");
            }
            return String.valueOf(str);
        }
    }
}
