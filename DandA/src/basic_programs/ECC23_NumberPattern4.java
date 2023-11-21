package basic_programs;

public class ECC23_NumberPattern4 {
    public static void main(String[] args) {
        System.out.println(numberPattern4(4));
        System.out.println(numberPattern4(10));
    }

    public static String numberPattern4(int rows) {
        if (rows < 0) {
            return "-1";
        } else if (rows == 0) {
            return "-2";
        } else {
            StringBuilder pattern = new StringBuilder();
            for (int i = 1; i <= rows; i++) {
                for (int j = 1; j <= i; j++) {
                    pattern.append(j*i+" ");
                }
                pattern.append("\n");
            }
            return pattern.toString();
        }
    }
}
