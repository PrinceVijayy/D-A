package recursion;

public class NaturalNumbers {
    public static void main(String[] args) {
        System.out.println(naturalNumbers(10));
    }

    static String naturalNumbers(int n) {
        if (n == 1) {
            return ""+1;
        } else {
            return  n+","+ naturalNumbers(n - 1);
        }
    }
}
