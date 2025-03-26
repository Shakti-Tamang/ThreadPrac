package com.company;

public class Thraed1 extends Thread {


    public void run(){
        System.out.println("Hello");try {
            for (int i = 0; i < 44; i++) {     System.out.println("Thread Starting");


                System.out.println(i);
                Thread.sleep(1000);
            }
        }
        catch (Exception ex){
            System.out.println(ex);
        }


    }
}
