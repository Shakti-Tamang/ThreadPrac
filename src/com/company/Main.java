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
//
//        The join() method is used to make the main thread (or any other thread) wait until the threads it is waiting for have finished their execution. Essentially, it ensures that the main thread does not proceed until all child threads have completed their tasks.
//
//        How join() Works:
//        When you call join() on a thread, the calling thread (in this case, the main thread) will pause and wait for the thread on which join() was called to finish executing.
//
//                The main thread is calling join() on each of the 5 threads, which ensures that the main thread will only print the final value of the counter after all the threads have finished their work.


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
