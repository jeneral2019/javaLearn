package base.exec;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExercise {
    public static void main(String[] args) {
        Staff staff1 = new Staff(1L,"阿三",10000);
        Staff staff2 = new Staff(2L,"阿四",20000);
        Staff staff3 = new Staff(3L,"阿宝",30000);

        Map<Long,Staff> map = new HashMap<>();
        map.put(staff1.getId(),staff1);
        map.put(staff2.getId(),staff2);
        map.put(staff3.getId(),staff3);

        System.out.println("====================");
        for (Object obj : map.entrySet()){
            Map.Entry<Long,Staff> entry = (Map.Entry<Long,Staff>) obj;
            if (entry.getValue().getSal() > 18000){
                System.out.println(entry.getValue());
            }
        }
        System.out.println("====================");

        for (Long id : map.keySet()){
            Staff staff = map.get(id);
            if (staff.getSal()>18000){
                System.out.println(staff);
            }
        }

        Set<Map.Entry<Long,Staff>> set = map.entrySet();
        Iterator<Map.Entry<Long,Staff>> staffIterator = set.iterator();
        while (staffIterator.hasNext()) {
            Map.Entry<Long,Staff> next =  staffIterator.next();
            System.out.println(next.getKey() + " - " + next.getValue());
        }

    }


}
class Staff{


    String name;
    double sal;
    long   id;

    public String getName() {
        return name;
    }

    public double getSal() {
        return sal;
    }

    public long getId() {
        return id;
    }

    public Staff( long id,String name, double sal) {
        this.name = name;
        this.sal = sal;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", id=" + id +
                '}';
    }
}
