public class ECC29_getSumOfFactors {
    public static void main(String[] args) {
        System.out.println(getSumOfFactors(3));
    }

    public static int getSumOfFactors(int n) {
        if (n < 0) return -1;
        else if (n == 0) return -2;
        else {
           int result=0;
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) result+=i;
            }
            return result;
        }
    }
}
