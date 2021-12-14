package base.interface_;

public interface Interface01 {
    public int n1 = 10;
    public void hi();
    public static void h2(){
        System.out.println("hi hi");
    }
    default public void h3(){

    }
}

class Face implements Interface01{
    @Override
    public void hi(){

    }
}
abstract class  Face2 implements Interface01{

}

class Face3 extends Face2{
    @Override
    public void hi(){

    }
}

class Mm{
    public static void main(String[] args) {
        Interface01 interface01 =  new Face();
        interface01.h3();
        Interface01.h2();
    }
}


interface IA{
    public void hi();
}
interface IB{
    public void hi();
}
interface IC extends IA,IB{}

class I implements IA,IB,IC{

    @Override
    public void hi(){

    }
}