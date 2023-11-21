package string_programs;

/**
 * Creating this pattern
 * <p>
 * 1
 * 1 2 1
 * 1 2 3 2 1
 * 1 2 3 4 3 2 1
 */
public class Pattern_01 {
    public static void main(String[] args) {
        for (int i = 1; i < 8; i++) {
            if (i % 2 != 0) {
                for (int j = 8, k = 1; j >= 1; j--) {
                    if (j <= i) {
                        if ((i / 2) >= j - 1) {
                            System.out.print(" " + k);
                            k--;
                        } else {
                            System.out.print(" " + k);
                            k++;
                        }
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }

    }
}
















