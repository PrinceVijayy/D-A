package recusion;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class CollectionDemo {
    public static void main(String[] args) {
        Map<Integer,String> data=new LinkedHashMap<>();
        data.put(1,"Dsdf");
        data.put(2,"Dfvrsdf");
        data.put(3,"Dsdfdfs");
        data.put(4,"Dsdfvsdf");
        data.put(5,"Dssdfadf");
        System.out.println(data.get(4));
        System.out.println(data.containsKey(4));
        System.out.println(data.values());
        System.out.println(data.entrySet());
    }
}
