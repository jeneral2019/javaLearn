package base.exec;

public class CodeBlockDetail02 {
    public static void main(String[] args) {
//        A.getN1();
        new A();
    }
}
class A{
    private int n2 = getN2();
    {
        System.out.println("A的普通代码块");
    }

    private int getN2() {
        System.out.println("getN2被调用");
        return 200;
    }

    private static int n1 =getN1();
    static {
        System.out.println("A 静态代码块01");
    }
    public static int getN1(){
        System.out.println("getN1 被执行");
        return 100;
    }

    public A(){
        System.out.println("A()构造器被调用");
    }
}