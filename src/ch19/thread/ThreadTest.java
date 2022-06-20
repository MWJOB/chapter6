package ch19.thread;

class MyThread implements Runnable{


    @Override
    public void run() {
        int i;
        for(i = 0; i<200; i++){
            System.out.print(i +"\t");
        }
    }
}

public class ThreadTest {

    public static void main(String[] args) {


        System.out.println(Thread.currentThread() +"start"); //main thread1

        MyThread runnable = new MyThread();
        Thread th1 = new Thread(runnable);
        Thread th2 = new Thread(runnable);
        System.out.println(Thread.currentThread() +"end");

        th1.start();
        th2.start();

        Runnable run = new Runnable() {
            @Override
            public void run() {
                System.out.println("run");

            }
        };
        run.run();
    }
}
