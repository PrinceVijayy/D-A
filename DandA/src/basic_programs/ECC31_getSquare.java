package basic_programs;

public class ECC31_getSquare {
    public static void main(String[] args) {
        System.out.println(getSquare(3));
    }

    public static int getSquare(int n) {
        if (n < 0) return -1;
        else if (n == 0) return -2;
        else {
            return n * n;
        }
    }
}
