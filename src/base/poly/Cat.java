package base.poly;

public class Cat extends Animal{

    public Cat(String name) {
        super(name);
    }

    @Override
    public void cry(){
        System.out.println("Cat cry():小猫喵喵叫 ");
    }
}
