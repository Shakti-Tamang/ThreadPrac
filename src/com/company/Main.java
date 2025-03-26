package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Thraed1 t1=new Thraed1();
        t1.start();



        ThreadRunnable threadRunnable=new ThreadRunnable();
        Thread thread=new Thread(threadRunnable);
        thread.start();


    }
}
