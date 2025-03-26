package com.company;

public class ThreadRunnable implements Runnable {
Thread thread;
String name;
    ThreadRunnable(String name){
        this.name=name;

        Thread thread=new Thread(this,name);
        System.out.println("New Thread"+"\t"+thread + "\n");
    }
    @Override
    public void run() {

//        System.out.println("Hello");

    }
}
