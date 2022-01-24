package base.exec;

import java.math.BigInteger;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Test01 {
    public static void main(String[] args) {
//        System.out.println(AA.a);
//        Object object = true ? new Integer(1):new Float(1.5);
//        System.out.println(object);
//        System.out.println(object.getClass());
//
//        Object object2;
//        if(true){
//            object2 = new Integer(1);
//        }else{
//            object2 = new Double(2.0);
//        }
//        System.out.println(object2);//输出1
//
//        Integer i = 100;
//        i.toString();
//        Date date = new Date();
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
//        System.out.println(sdf.format(date));
//
//        Calendar calendar = Calendar.getInstance();
//        System.out.println(Calendar.MONDAY);
//
//        LocalDateTime localDateTime = LocalDateTime.now();
//        System.out.println(localDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
//
//        Instant instant = Instant.now();
//        System.out.println(instant);
//        System.out.println(Date.from(instant));
//        List<Object> list = new ArrayList();
//        list.add("jack");
//        list.add(0);
//        list.add(true);
//        System.out.println(list);
//        System.out.println(list.remove(0));
//        System.out.println(list);
//        System.out.println(list.remove(new Integer(0)));
//        System.out.println(list);

//        Vector ver = new Vector();
//        for (int i = 0; i < 10; i++) {
//            ver.add(i);
//        }
//        ver.add(11);
//        LinkedList linkedList = new LinkedList();
//        linkedList.add("bbb");
//        linkedList.add("aaa");
//        linkedList.remove("aaa");
//
////        linkedList.get(1);
//
//        for (Object o :linkedList){
//            System.out.println(o);
//        }
//        Iterator iterator = linkedList.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
//
//        Set<String> stringSet = new HashSet<>();
//        for (int i = 0; i < 100; i++) {
//            stringSet.add("" + i);
//        }
//
//        LinkedHashSet<String> stringLinkedHashSet = new LinkedHashSet<>();
//        stringLinkedHashSet.add("aaa");
//        stringLinkedHashSet.add("aaa");

        Map map = new HashMap();
        map.put("aaa","aaa");
        map.put("aaa2","aaa2");
        map.put("aaa3","aaa3");
        map.put("aaa4","aaa4");
        for (Object object : map.keySet()){
            System.out.println(object + " = " + map.get(object));
        }
        System.out.println("====================");
        for (Object object: map.entrySet()){
            Map.Entry entry = (Map.Entry) object;
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
        System.out.println("====================");

        Collection c = map.values();
        System.out.println(map.values());


        String a = "aaa" ;
        if (a == "bbb"){

        }

    }

}

class ListFyx{
    int index;
    ListFyx firstList;
    Object value;
    ListFyx nextList;

    public void add(Object value){

    }


    @Override
    public String toString() {
        return value.toString();
    }
}
