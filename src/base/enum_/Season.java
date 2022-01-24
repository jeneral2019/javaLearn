package base.enum_;

public enum Season{

    SPRING("春天",""),SUMMON("夏天","炎热");

    private String name;
    private String desc;

    @Override
    public String toString() {
        return "Season{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }

    Season(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }
}
