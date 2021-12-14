package base.poly.polyparameter;

public class Manager extends Employee{
    private double bonus;

    public Manager(String name, double salary,double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    public void manage(){

    }

    @Override
    public double getAnnual(){
        return getSalary() + bonus;
    }
}
