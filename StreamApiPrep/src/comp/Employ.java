package comp;

//public class Employ implements Comparable<Employ>{
public class Employ {

    private String name;
    private String phone;
    private String empid;

//    @Override
//    public int compareTo(Employ o) {
//        return this.empid - o.empid;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmpid() {
        return empid;
    }

    public void setEmpid(String empid) {
        this.empid = empid;
    }

    public Employ(String phone, String name, String empid) {
        this.phone = phone;
        this.name = name;
        this.empid = empid;
    }

    @Override
    public String toString() {
        return "Employ{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", empid='" + empid + '\'' +
                '}';
    }


}
