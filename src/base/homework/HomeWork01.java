package base.homework;

public class HomeWork01 {

    public static void main(String[] args) {
        Person[] people = new Person[10];
        people[0] = new Person("a",40,"老师");
        people[1] = new Person("b",45,"老师");
        people[2] = new Person("c",20,"学生");
        people[3] = new Person("d",22,"学生");
        people[4] = new Person("e",42,"老师");
        people[5] = new Person("f",26,"学生");
        people[6] = new Person("g",50,"老师");
        people[7] = new Person("h",28,"学生");
        people[8] = new Person("i",49,"老师");
        people[9] = new Person("j",19,"学生");

        for (int i = 1; i < people.length; i++){
            for (int j=0;j < people.length - i; j++){
                if (people[j].getAge() > people[j+1].getAge()){
                    Person person = people[j];
                    people[j] = people[j+1];
                    people[j+1] = person;
                }
            }
        }

        for (int i = 0; i < people.length;i++){
            System.out.println(people[i]);
        }
    }
}

class Person{
    private String name;
    private int age;
    private String job;

    public Person(String name,int age,String job){
        this.name = name;
        this.age = age;
        this.job = job;
    }
    public int getAge(){
        return this.age;
    }
    @Override
    public String toString(){
        return this.name + "\t" + this.age + "\t" + this.job;
    }
}