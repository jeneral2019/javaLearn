package base.homework;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class HomeWork06 {
    public static void main(String[] args) {

        List list = new ArrayList();
        list.add(new News("新冠确诊病例超千万，数百万印度教信徒赴恒河\"圣浴\"引民众担忧"));
        list.add(new News("男子突然想起2个月前钓的鱼还在网兜里，捞起一看赶紧放生"));

        for (int i = list.size() - 1 ; i >= 0 ; i--) {
            String title = list.get(i).toString();
            if (title == null){
                System.out.println();
            }
            if (title.length()<=15){
                System.out.println(title);
            }else {
                System.out.println(title.substring(0,15) + "...");
            }

        }

//        list.sort(new Comparator() {
//            @Override
//            public int compare(Object o1, Object o2) {
//                return (((News)o2).getTitle()).compareTo(((News)o1).getTitle());
//            }
//        });
//        System.out.println(list);

    }
}
class News{
    private String title;
    private String text;

    public News(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return title;
    }
}
