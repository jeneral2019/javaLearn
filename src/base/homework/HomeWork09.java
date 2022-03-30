package base.homework;

import java.util.Scanner;

public class HomeWork09 {
    private static boolean loop = true;

    public static void main(String[] args) {
        A a = new A();
        Thread t1 = new Thread(a);
        Thread t2 = new Thread(new B(a));
        t1.start();
        t2.start();
    }

}

class A implements Runnable{

    private boolean loop = true;
    @Override
    public void run() {
        while (loop){
            System.out.println((int)(Math.random() * 100 +1));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void setLoop(boolean loop) {
        this.loop = loop;
    }
}

class B implements Runnable{

    private A a;
    Scanner scanner = new Scanner(System.in);

    public B(A a) {
        this.a = a;
    }

    @Override
    public void run() {

        while (true){
            System.out.println("请输入你的指令");
            String print = scanner.next();
            if (print.compareTo("Q") == 0){
                a.setLoop(false);
                break;
            }
        }
    }
}