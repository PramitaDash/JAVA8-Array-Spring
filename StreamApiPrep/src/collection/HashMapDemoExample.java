package collection;

import java.util.*;

public class HashMapDemoExample {

    public static void main(String[] args) {
        HashMap m = new HashMap();
        m.put("Pramita" , 10);
        m.put("Shubra" , 20);
        m.put("Ananya", 30);
        m.put("Sai" , 40);

        System.out.println(m);
        System.out.println(m.put("Shubra", 50));
        Set s = m.keySet();
        System.out.println(s);
        Collection c = m.values();
        System.out.println(c);
        Set s1 = m.entrySet();
        System.out.println(s1);

        Iterator itr = s1.iterator();
        while(itr.hasNext()){
            Map.Entry m1 = (Map.Entry)itr.next();
            System.out.println(m1.getKey()+ "----------"+ m1.getValue()) ;
            if(m1.getKey().equals("Ananya")){
                m1.setValue(50);
            }
        }
        System.out.println(m);

    }
}
