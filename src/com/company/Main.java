package com.company;

import java.util.ArrayList;
import java.util.List;
//import java.util.function.Function;


public class Main {

    public static void main(String[] args) {
	// write your code here

//        Thraed1 t1=new Thraed1();
//        t1.start();

        Thread  thread[]=new Thread[5];

        final AsyncThreadPrac asyncThreadPrac=new AsyncThreadPrac();

//
//        Why Use join()?
//                Thread Synchronization: It ensures proper synchronization between threads. Without join(), you can't guarantee that all threads will finish their tasks before the program moves on, especially when the main thread depends on their results.
//
//        Preventing Premature Program Exit: If the main thread finishes executing before the child threads, the child threads may not have finished their tasks, leading to incomplete results.
//
//                Coordinating Concurrent Tasks: join() allows you to coordinate the termination of multiple threads in a way that ensures proper sequencing of tasks.
        for(int i=0;i<thread.length;i++){
            thread[i] =new Thread(new Runnable() {
                @Override
                public void run() {
           asyncThreadPrac.Increment();
                }
            },
                    "thread"+(i+1));
            thread[i].start();
        }
        for (Thread thread1 : thread) {
            try {
                thread1.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Final counter value: " + AsyncThreadPrac.counter);




//        try{
//   t1.stop();
//        }
//        catch (Exception ex){
//            System.out.println(ex);
//        }




//        new ThreadRunnable("1st");
//        new ThreadRunnable("2nd");
//        new ThreadRunnable("3rd");
//
//        try{
//            Thread.sleep(8000);
//        }
//        catch (InterruptedException ex){
//            System.out.println(ex);
//        }




//        ThreadRunnable threadRunnable=new ThreadRunnable();
//        Thread thread=new Thread(threadRunnable);
//        thread.start();
//
//        List<String>list=new ArrayList<String>();
//
//        list.add("shakti");
//        list.add("anu");
//        list.add("aman");

//        not supportged

//        Function<Long,Long> am= a->a+7;
        }


    }
