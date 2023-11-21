package basic_programs;

import java.util.Arrays;
import java.util.OptionalInt;

public class ECC49_findMax {
    public static void main(String[] args) {
        System.out.println(findMax(new int[]{1,2,3,-1,-2,-3}));
    }
    public static int findMax(int[] arr) {
        int count = 0;
        for (int data : arr) {
            if (data < 0) count++;
        }
        if (arr == null) return 0;
        else if (count < 3) return -1;
        else {
            return Arrays.stream(arr).max().getAsInt();
        }
    }
}
