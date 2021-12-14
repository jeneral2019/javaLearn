package base.single_;

public class SingleTon02 {
    public static void main(String[] args) {
        Cat.getInstance();
    }
}
//希望在程序运行过程中，只能创建一个cat对象
//使用单例模式
class Cat{
    private String name;
    private static Cat cat;

    private Cat(String name) {
        this.name = name;
    }
    public static Cat getInstance(){
        if (cat == null){
            return new Cat("小红花");
        }
        return cat;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
