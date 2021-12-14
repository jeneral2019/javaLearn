package base.poly.polyparameter;

public class Test {

    public static void main(String[] args) {
        Worker tom = new Worker("tom",2500);
        Manager lisa = new Manager("lisa",5000,20000);

        new Test().showEmpAnnual(tom);
        new Test().showEmpAnnual(lisa);
    }
    public void showEmpAnnual(Employee e){
        System.out.println(e.getAnnual());
    }
}
