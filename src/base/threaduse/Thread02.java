package base.threaduse;

public class Thread02 {
    public static void main(String[] args) throws InterruptedException {

        T3 t3 = new T3();
        T4 t4 = new T4();

        t3.start();
        t4.start();

        for (int i = 1; i < 11;) {
            if (i == 5){
                System.out.println("小弟让老大先吃包子");
                t3.join();
            }
            System.out.println(Thread.currentThread().getName() + ":小弟吃第"+(i++)+"个包子");
            Thread.sleep(1000);
        }
    }
}

class T3 extends Thread{
    @Override
    public void run() {
        try {
            for (int i = 1; i < 11;) {
                System.out.println(Thread.currentThread().getName() + ":老大吃第"+(i++)+"个包子");
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}class T4 extends Thread{
    @Override
    public void run() {
        try {
            for (int i = 1; i < 11;) {
                System.out.println(Thread.currentThread().getName() +  ":客人吃第"+(i++)+"个包子");
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}