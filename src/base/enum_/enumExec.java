package base.enum_;

public class enumExec {
    public static void main(String[] args) {
//        System.out.println(Season02.SPRING);
        Season season = Season.SPRING;
        System.out.println(season.name());
        System.out.println(season.ordinal());
        for (Season season2:Season.values()){
            System.out.println(season2);

        }
    }
}
class Season02{
    @Override
    public String toString() {
        return "Season{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }

    public final static Season02 SPRING = new Season02("春天","");
    public void setName(String name) {
        this.name = name;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    private String name;
    private String desc;

    private Season02(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }
}
