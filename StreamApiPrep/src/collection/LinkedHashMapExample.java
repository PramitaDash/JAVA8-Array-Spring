package collection;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        Map<String, Integer> m = new LinkedHashMap<>();
        m.put("Pramita", 1);
        m.put("sai" ,2);
        m.put("Shubra", 3);
        m.put("shubra",3);
        System.out.println(m);

        System.out.println(m.keySet());


    }
}
