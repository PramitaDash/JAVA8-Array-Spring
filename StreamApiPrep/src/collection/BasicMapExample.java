package collection;

import java.util.HashMap;
import java.util.Map;

public class BasicMapExample {
    public static void main(String[] args) {
        Map<Integer, String> m = new HashMap<>();
        m.put(1,"Pramita");
        m.put(2, "Shubra");
        m.put(3, "Sai");
        m.put(4, "Tapu");

        System.out.println(m);
        String value = m.get(2);
        System.out.println(value);
        System.out.println(m.containsKey(3));
        System.out.println(m.containsValue("Sai"));

        for(Map.Entry<Integer, String> entry: m.entrySet()){
            System.out.println(entry.getKey()+","+entry.getValue());
        }
        m.remove(1);
        System.out.println(m);
        System.out.println(m.size());
    }
}
