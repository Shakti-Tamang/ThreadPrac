package com.company;

import org.w3c.dom.ls.LSOutput;

public class AsyncThreadPrac {

     static int counter;

//     say it in simple way

//    Remember: Synchronization is about coordinating access to shared state between threads, not about
//    making operations synchronous (though it has that side effect). For true asynchronous operations,
//    look at Java's CompletableFuture or the java.util.concurrent package.


//    In Java, synchronization is used to control access to shared resources in a multi-threaded
//    environment. Without synchronization, when multiple threads try to access the same shared resource,
//    there is a possibility of race conditions, where the threads can interfere with each other, leading to
//    inconsistent or incorrect results.
//
//    On the other hand, simple threads (without synchronization) may allow multiple threads to access shared
//    data simultaneously, which can lead to issues like data inconsistency or corruption.
    public synchronized void Increment(){
        System.out.println("The thraed name"+Thread.currentThread().getName());
        counter ++;
        try {
            Thread.sleep(100);
        }
        catch(InterruptedException ex){
            System.out.println(ex);
        }

        System.out.println(Thread.currentThread().getName()+"\t"+"the count :"+"\t"+counter);
    }
}
