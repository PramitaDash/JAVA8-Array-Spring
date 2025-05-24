package comp;

import java.util.Comparator;

public class IdComparator implements Comparator<Employ> {
    @Override
    public int compare(Employ o1, Employ o2) {
        return o1.getEmpid().compareTo(o2.getEmpid());
    }
}
