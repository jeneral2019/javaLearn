package test;

import javax.imageio.stream.ImageInputStream;

public interface InterTest {
    public void say();

    default String say2(){
        return "a";
    }

}

class AA implements InterTest{
    @Override
    public void say(){

    }
}

class BB{
    public static void main(String[] args) {
        AA aa = new AA();
        String b = aa.say2();
    }
}
