package base.exec;

public class CodeBlockDetail01 {
    public static void main(String[] args) {
//        AA aa = new AA();
//        System.out.println(AA.b);
        AA aa = new AA();
        BB bb = new AA();
    }
}
class AA extends BB{
    public static int a = 100;
    static {
        System.out.println("AA code static block ");
        System.out.println(BB.b);
    }
    {
        System.out.println("AA code block 2");
    }
    public AA(){
        System.out.println("AA init");
    }
}
class BB{
    public static int b = 200;
    static {
        System.out.println("BB code static block ");
    }
    {
        System.out.println("BB code block 2");
    }
    public BB(){
        System.out.println("BB init");
    }
}
