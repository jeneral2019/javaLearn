package base.innerclass;

public class LocalInnerClass {
    public static void main(String[] args) {
//        Outer outer = new Outer();
//        outer.m1();
        Father father = new Father("JJ");
        Father father1 = new Father("GG"){};
        System.out.println(father.getClass());
        System.out.println(father1.getClass());
    }
}
class Outer{
    private  int n1 = 100;
    private  void m2(){
        System.out.println("m2 start....");
    }
    public void m1(){
        class Inner{
            private int n1 = 200;
            public int nn2 = 300;
            public void f1(){
                System.out.println("n1(outer) = " + Outer.this.n1 );
                System.out.println("n1(inner) = " + n1);
                m2();
            }
        }

        class Inner02 extends Inner{
            public void f2(){
                f1();
                System.out.println(super.nn2);
            }
        }
        Inner inner = new Inner();
        inner.f1();

        Inner02 inner02 = new Inner02();
        inner02.f2();

    }
}

class Father{
    public Father(String name) {
        this.name = name;
    }

    private String name;
}