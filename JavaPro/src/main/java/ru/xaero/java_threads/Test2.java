package ru.xaero.java_threads;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        Scanner scan = new Scanner(System.in);
        scan.nextLine();
        myThread.shutdown();


    }

}

//Используем volatile если потоки исп общий ресурс!
class MyThread extends Thread{
    private volatile boolean running = true;
    public void run(){
        while(running){
            System.out.println("Hello");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public void shutdown(){
        this.running = false;
    }
}
