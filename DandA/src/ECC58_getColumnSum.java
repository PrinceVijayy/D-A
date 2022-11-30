import java.util.Arrays;

public class ECC58_getColumnSum {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getColumnSum(new int[][]{{1, 2, 3}, {1, 2, 3}, {1, 2, 3}})));

    }

    public static int[] getColumnSum(int[][] arr) {
        if (arr == null || arr.length > 3) return null;
        else {
            int[] result = new int[3];
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length; j++) {
                    result[i] += arr[j][i];
                }
            }
            return result;
        }
    }
}
