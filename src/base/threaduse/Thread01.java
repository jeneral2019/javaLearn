package base.threaduse;

import base.maze.Run;

public class Thread01 {
    public static void main(String[] args) {
//        Cat cat = new Cat();
//        cat.start();
//        Hi hi = new Hi();
//        Thread thread = new Thread(hi);
//        thread.start();
//        System.out.println("main");

        T1 t1 = new T1();
        T2 t2 = new T2();
        Thread thread1 = new Thread(t1);
        Thread thread2 = new Thread(t2);
        thread1.start();
        thread2.start();

    }
}

class T1 implements Runnable{
    int count = 0;

    @Override
    public void run() {

        while (count < 10){
            System.out.println("hello,world" + (++count) + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}class T2 implements Runnable{
    int count = 0;

    @Override
    public void run() {

        while (count < 5){
            System.out.println("hi " + (++count) + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Cat extends Thread{

    @Override
    public void run() {
        int time = 0;

        while (time<80){
            System.out.println("喵喵，我是小猫咪");
            time++;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}

class Hi implements Runnable{

    public void start(){

    }

    @Override
    public void run() {
        int times = 0;
        while (times < 10){
            System.out.println("hi~ " + ++times + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}