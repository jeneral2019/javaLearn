package base.exec;

import java.util.HashSet;
import java.util.Objects;

public class HashSetExercise {
    public static void main(String[] args) {
        HashSet<Employee> employeeHashSet = new HashSet<>();
        employeeHashSet.add(new Employee("jack",2000.00,new Employee.MyDate(2019,12,1)));

    }
}

class Employee{
    public Employee(String name, double sal, MyDate myDate) {
        this.name = name;
        this.sal = sal;
        this.myDate = myDate;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Employee employee = (Employee) object;
        return Double.compare(employee.sal, sal) == 0 &&
                Objects.equals(name, employee.name) &&
                Objects.equals(myDate, employee.myDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, sal, myDate);
    }

    private String name;
    private double sal;
    private MyDate myDate;


    static class MyDate{

        private int year;
        private int month;
        private int day;

        public MyDate(int year, int month, int day) {
            this.year = year;
            this.month = month;
            this.day = day;
        }

        @Override
        public boolean equals(Object object) {
            if (this == object) return true;
            if (object == null || getClass() != object.getClass()) return false;
            MyDate myDate = (MyDate) object;
            return Objects.equals(year, myDate.year) &&
                    Objects.equals(month, myDate.month) &&
                    Objects.equals(day, myDate.day);
        }

        @Override
        public int hashCode() {
            return Objects.hash(year, month, day);
        }
    }
}
