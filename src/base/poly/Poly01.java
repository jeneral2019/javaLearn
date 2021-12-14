package base.poly;

public class Poly01 {
    public static void main(String[] args) {
        Master master = new Master("tomcat");
        Dog dog = new Dog("大黄");
        Bone bone = new Bone("大棒骨");

        Cat cat = new Cat("小黄");
        Fish fish = new Fish("小黄鱼");
        master.feed(dog,bone);

        master.feed(cat,fish);

        Animal animal1 = new Dog("小黑");
        Animal animal2 = new Cat("小花");

        animal1.cry();

        animal1 = new Cat("小花");

        animal1.cry();
        animal1.getName();

        System.out.println("==================");
        Cat cat1 = (Cat) animal2;
        cat1.cry();
        cat1.getName();
        System.out.println("==================");


        Food food1 = new Fish("小鱼");

        master.feed(animal1,food1);

    }
}
