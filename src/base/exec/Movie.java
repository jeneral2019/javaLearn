package base.exec;

public class Movie {
    private String name;
    private double price;
    private String director;

    public static void main(String[] args) {
        Movie movie1 = new Movie();
        Movie movie2 = new Movie("你好，李焕英");
        Movie movie3 = new Movie("唐探3",20.0,"小唐");

    }

    {
        System.out.println("电影屏幕打开...");
        System.out.println("广告开始...");
        System.out.println("电影正式开始...");
    }

    public Movie(){

    }

    public Movie(String name) {
        this.name = name;
    }

    public Movie(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Movie(String name, double price, String director) {
        this.name = name;
        this.price = price;
        this.director = director;
    }
}

