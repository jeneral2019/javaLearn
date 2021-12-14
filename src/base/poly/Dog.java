package base.poly;

public class Dog extends Animal{
    public Dog(String name) {
        super(name);
    }

    public void run(){
        System.out.println("dog run");
    }

    @Override
    public void cry(){
        System.out.println("Dog cry():小狗汪汪叫 ");
    }
}
