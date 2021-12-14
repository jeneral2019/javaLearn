package base.poly;

public class Animal {
    private String name;

    public Animal(String name){
        this.name = name;
    }
    public void cry(){
        System.out.println("动物在哭");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
