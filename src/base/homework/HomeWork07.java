package base.homework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HomeWork07 {
    public static void main(String[] args) {
        HashMap<String,Integer> hashMap = new HashMap<>();
        hashMap.put("jack",650);
        hashMap.put("tom",1200);
        hashMap.put("smith",2900);

        hashMap.put("jack",2600);

        for (String name:hashMap.keySet()){
            hashMap.put(name,hashMap.get(name) + 100);
        }

        //遍历所有员工

        //1
        Set<Map.Entry<String,Integer>> entry =  hashMap.entrySet();
        Iterator<Map.Entry<String, Integer>> iterable = entry.iterator();
        while (iterable.hasNext()) {
            Map.Entry<String, Integer> next =  iterable.next();
//            System.out.println(next.getKey() + "-" + next.getValue());
            System.out.println(next.getKey());
        }
        //2
        for (String name:hashMap.keySet()){
            System.out.println(hashMap.get(name));
        }


        //遍历所有工资
        System.out.println(hashMap.values());
    }
}

