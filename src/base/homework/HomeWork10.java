package base.homework;

public class HomeWork10 {
    public static void main(String[] args) {
        T t = new T();
        Thread thread1 = new Thread(t);
        Thread thread2 = new Thread(t);
        thread1.start();
        thread2.start();
    }
}

class T implements Runnable{

    private static double money = 10000;
    @Override
    public void run() {
        while (true){
            synchronized (this){
                if (money < 1000){
                    System.out.println(Thread.currentThread().getName() + " : 余额不足" + money);
                    break;
                }else {
                    money = money - 1000;
                    System.out.println(Thread.currentThread().getName() + " : 取出1000块钱，当前余额为 " + money);

                }
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
