package basic_programs;

public class ECC22_createStarPattern {
    public static void main(String[] args) {
        System.out.println(createStarPattern(4));
        System.out.println(createStarPattern(10));
    }

    public static String createStarPattern(int rows) {
        if (rows < 0) {
            return "-1";
        } else if (rows == 0) {
            return "-2";
        } else {
            StringBuilder pattern = new StringBuilder();
            for (int i = 1; i <= rows; i++) {
                for (int j = 0; j < i; j++) {
                    pattern.append("*");
                }
                pattern.append("\n");
            }
            return pattern.toString();
        }
    }
}
