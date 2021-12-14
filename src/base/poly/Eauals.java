package base.poly;


public class Eauals {
    public static void main(String[] args) {






        String a1 = "a";
        String a2 = "a";
        System.out.println(a1 == a2);

        int b1 = 10;
        double b2 = 10.0;
        System.out.println(b1 == b2);

        "hello".equals("abc");
        System.out.println("+++++++=====================");
        Object a = new Object();
        a.toString();
        a = "hello";
        String b = "hello";
        StringBuilder c1 = new StringBuilder("hello");
        StringBuffer d1 = new StringBuffer("hello");
        StringBuilder c2 = new StringBuilder("hello");
        StringBuffer d2 = new StringBuffer("hello");


        System.out.println(a.equals(b)); //T
        System.out.println(a.equals(c1)); //F
        System.out.println(a.equals(d1)); //F
        System.out.println(c1.equals(c2)); //F
        System.out.println(d1.equals(d2)); //F


        System.out.println("===================");
        String e1 = "hello";
        String e2 = "hello";
        System.out.println(e1.equals(e2));

        String f1 = new String("hello");
        String f2 = new String("hello");
        System.out.println(f1.equals(f2));

        System.out.println("===================");

        System.out.println(e1.hashCode() == e2.hashCode());

        System.out.println("===================");
    }
}
