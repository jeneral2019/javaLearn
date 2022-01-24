package base.exec;

import java.util.Arrays;
import java.util.Comparator;

public class ArrayExercise {
    public static void main(String[] args) {
        Book[] books = new Book[4];
        books[0] = new Book("红楼梦~",100);
        books[1] = new Book("金品梅~",90);
        books[2] = new Book("青年文摘~",5);
        books[3] = new Book("java从入门到放弃~",300);
        System.out.println(Arrays.toString(books));

        Arrays.sort(books, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return (int)(o1.getPirce() - o2.getPirce());
            }
        });

        System.out.println(Arrays.toString(books));

        Arrays.sort(books, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return (int)(o2.getPirce() - o1.getPirce());
            }
        });
        System.out.println(Arrays.toString(books));

        Arrays.sort(books, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return (int)(o2.getName().length() - o1.getName().length());
            }
        });
        System.out.println(Arrays.toString(books));

    }
}

class Book{
    public Book(String name, double pirce) {
        this.name = name;
        this.pirce = pirce;
    }

    private String name;
    private double pirce;

    public String getName() {
        return name;
    }

    public double getPirce() {
        return pirce;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", pirce=" + pirce +
                '}';
    }
}