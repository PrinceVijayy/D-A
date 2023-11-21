package basic_programs;

public class ECC27_getFactorial {
    public static void main(String[] args) {
        System.out.println(getFactorial(6));
    }

    public static int getFactorial(int n) {
        if (n < 0) return -1;
        else if (n == 0) return -2;
        else {
            if (n == 0) return 1;
            else return n * getFactorial(n - 1);
        }

    }
}
