package ru.xaero.java_threads;

public class Test1 {
    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new Runner());
        thread1.start();
        Thread thread2 = new Thread(new Runner());
        thread2.start();


    }
}
class Runner implements Runnable{
    public void run(){
        for(int i = 0; i<1000;i++){
            System.out.println("Hello from MyThread" + i);
        }
    }
}
class MyThread123 extends Thread{
    public void run(){
        for(int i = 0; i<1000;i++){
            System.out.println("Hello from MyThread" + i);
        }
    }
}
