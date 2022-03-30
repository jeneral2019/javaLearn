package base.exec;

public class ThreadMethodExercise {
    public static void main(String[] args) throws InterruptedException {
        T1 t1 = new T1();
        Thread thread = new Thread(t1);

        for (int i = 0; i <10 ; i++) {
            if (i == 5){
                thread.start();
                thread.join();
            }

            System.out.println(Thread.currentThread().getName() + " hi" + (i+1));
            Thread.sleep(1000);
        }
    }
}

class T1 implements  Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "启动");
        for (int i = 0; i <10 ; i++) {
            System.out.println(Thread.currentThread().getName() + "： hello " + (i+1));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}