package basic_programs;

import java.util.ArrayList;

public class ECC40_RussianMultiplication {
    public static void main(String[] args) {
        System.out.println(getProduct(11, 12));

    }

    public static int getProduct(int num1, int num2) {
        if (num1 < 0 || num2 < 0) return -1;
        else {
            int result = 0;
            ArrayList<Integer> doubling = new ArrayList<>();
            while (num1 > 0) {
                if (num1 % 2 != 0 || num2 % 2 != 0) {
                    doubling.add(num2);
                }
                num1 /= 2;
                num2 *= 2;
            }
            for (Integer data : doubling) {
                result += data;
            }
            return result;
        }
    }
}
