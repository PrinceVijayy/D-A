package Assignment;

public class ECC21_createBoxPattern {
    public static void main(String[] args) {
        System.out.println(createBoxPattern(4, 5));
        System.out.println(createBoxPattern(10, 6));
    }

    public static String createBoxPattern(int rows, int columns) {
        if (rows < 0 || columns < 0) {
            return "-1";
        } else if (rows == 0 || columns == 0) {
            return "-2";
        } else {
            StringBuilder pattern = new StringBuilder();
            for (int i = 1; i <= rows; i++) {
                for (int j = 1; j <= columns; j++) {
                    if (i > 1 && j > 1 && i < rows && j < columns) {
                        pattern.append(" ");
                    } else {
                        pattern.append("*");
                    }
                }
                pattern.append("\n");
            }
            return pattern.toString();
        }

    }
}





