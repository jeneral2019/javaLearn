package base.exec;

public class CodeBlockDetail03 {
    public static void main(String[] args) {
        new BBB();
    }
}
class AAA{
    {
        System.out.println("AAA的普通代码块");
    }
    public AAA(){
        System.out.println("AAA() 构造器被调用...");
    }
}
class BBB extends AAA{
    private static  int a  = 100;
    private static  int b  = 200;
    static {
        System.out.println("BBB的普通代码块" + a + b);
    }
    public BBB(){
        System.out.println("BBB() 构造器被调用...");
    }
}