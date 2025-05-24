package comp;

import java.util.ArrayList;
import java.util.Collections;

public class SortExample {

    public static void main(String[] args) {
        ArrayList<Employ> emp = new ArrayList<>();
        emp.add(new Employ("80492384","Pramita","32"));
        emp.add(new Employ("789374","Priya","12"));
        emp.add(new Employ("1820398","Prachi","89"));
        System.out.println(emp);
        Collections.sort(emp, new IdComparator());
        //comparable
        System.out.println(emp);

    }
}
