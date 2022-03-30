package base.homework;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Test;

import java.util.*;

public class HomeWork08 {
    public static void main(String[] args) {
        DAO<User> userDAO = new DAO<>();
        userDAO.save("a",new User(1000,20,"jack"));
        userDAO.save("b",new User(1001,21,"tom"));
        userDAO.save("c",new User(1002,22,"smith"));
        userDAO.save("d",new User(1003,23,"fyx"));

        userDAO.get("a");
        userDAO.update("b",new User(1004,25,"tt"));
        System.out.println(userDAO.list());

        userDAO.delete("c");

    }

    @Test
    public void test1(){

    }


}

class DAO<T>{
    Map<String,T> map = new HashMap<>();
    public void save(String id,T entity){
        map.put(id,entity);
    }

    public T get(String id){
        return map.get(id);
    }

    public void update(String id,T entity){
        map.put(id,entity);
    }

    public List<T> list(){

        List<T> list = new ArrayList<>();
        for (T t:map.values()){
            list.add(t);
        }
        return list;
    }

    public void delete(String id){
        map.remove(id);
    }
}
class User{
    private int id,age;
    private String name;

    public User(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}