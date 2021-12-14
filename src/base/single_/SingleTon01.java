package base.single_;

public class SingleTon01 {
    public static void main(String[] args) {
        GirlFriend xh = GirlFriend.getInstance();
        System.out.println(xh);
    }
}

class GirlFriend{
    private String name;

    private static GirlFriend gf = new GirlFriend("小红花");
    private GirlFriend(String name) {
        this.name = name;
    }

    public static GirlFriend getInstance(){
        return gf;
    }

    @Override
    public String toString() {
        return "GirlFriend{" +
                "name='" + name + '\'' +
                '}';
    }

}