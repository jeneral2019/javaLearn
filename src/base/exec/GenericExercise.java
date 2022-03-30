package base.exec;

import java.util.ArrayList;
import java.util.Comparator;

public class GenericExercise {
    public static void main(String[] args) {
        ArrayList<Employee02> employees = new ArrayList<>();
        employees.add(new Employee02("jack",2000.00,new MyDate(2020,1,1)));
        employees.add(new Employee02("tom",12000.00,new MyDate(2019,12,1)));
        employees.add(new Employee02("smith",8000.00,new MyDate(2020,1,15)));



        employees.sort(new Comparator<Employee02>() {
            @Override
            public int compare(Employee02 o1, Employee02 o2) {
                if (o1.getName().compareTo(o2.getName()) == 0){
                    return o1.getBirthday().compareTo(o2.getBirthday());
                }else {
                    return o1.getName().compareTo(o2.getName());
                }
            }
        });

        System.out.println(employees);
    }
}

class Employee02{
    private String name;
    private double sal;
    private MyDate birthday;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }

    public Employee02(String name, double sal, MyDate birthday) {
        this.name = name;
        this.sal = sal;
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Employee02{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", birthday=" + birthday +
                '}';
    }
}

class MyDate implements Comparable<MyDate>{
    private int month;
    private int day;
    private int year;

    public MyDate(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public int compareTo(MyDate myDate){
        if (this.year == myDate.getYear()){
            if (this.month == myDate.getMonth()){
                return this.month - myDate.getMonth();
            }else {
                return this.day - myDate.getDay();
            }
        }else {
            return this.year - myDate.getYear();
        }
    }

}