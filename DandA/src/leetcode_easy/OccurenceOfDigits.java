package leetcode_easy;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OccurenceOfDigits {
    public static void main(String[] args) {
        List<Integer> inputList = List.of(1, 2, 2, 3, 3, 4, 4, 4, 5, 5, 5, 5, 5);
        Map<Integer, Integer> map = new HashMap<>();
        inputList.forEach(i -> {
            if (!map.containsKey(i)) {
                map.put(i, 1);
            } else {
                map.put(i, map.get(i) + 1);
            }
        });
        map.forEach((k,v)->{
            if(k.equals(v)){
                System.out.println(k);
            }
        });
    }
}
