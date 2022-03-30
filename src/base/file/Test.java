package base.file;


import java.util.ArrayList;
import java.util.List;


public class Test {

    public static void main(String[] args) {

//        String[] a = new String[3];
//        a[0] ="1";
//        a[1] ="2";
//        a[2] ="3";

        List<String> b =new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            b.add(i + "");
        }


        b.forEach(n-> System.out.println(n));
        b.stream().filter(f -> f.compareTo("1")==1);
    }
}
