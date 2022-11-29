import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ECC48_getIncreaseDecrease {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getIncreaseDecrease(5)));
        System.out.println(Arrays.toString(getIncreaseDecrease(8)));
        System.out.println(Arrays.toString(getIncreaseDecrease(-29)));
    }

    public static int[] getIncreaseDecrease(int num) {
        if (num <= 1 || num > 20) return null;
        else {
            int[] arr = new int[num];
            for (int i = 0, j = 1, k = num; i < num; i = i + 2, j++, k--) {
                arr[i] = j;
                if (i + 1 < num) arr[i + 1] = k;
            }
            return arr;
        }
    }
}
