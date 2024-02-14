package cs;

import java.util.ArrayList;

public class BinarySearc {

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(2147483621);
        arr.add(2147483622);
        arr.add(2147483623);
        arr.add(2147483624);
        arr.add(2147483625);
        arr.add(2147483626);
        arr.add(2147483624);
        arr.add(2147483622);
        System.out.println(arr);
        int target = 2147483625;
        int i = 0, j = arr.size()-1, mid = 0;
        while (i < j) {
            mid = (i + j) / 2;
            if (target <= arr.get(mid) ) {
                j = mid;
            } else {
                i = mid + 1;
            }
        }
        System.out.println(mid);
    }
}
