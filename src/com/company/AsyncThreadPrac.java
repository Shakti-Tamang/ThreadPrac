package com.company;

public class AsyncThreadPrac {
//    In Java, synchronization is used to control access to shared resources in a multi-threaded
//    environment. Without synchronization, when multiple threads try to access the same shared resource,
//    there is a possibility of race conditions, where the threads can interfere with each other, leading to
//    inconsistent or incorrect results.
//
//    On the other hand, simple threads (without synchronization) may allow multiple threads to access shared
//    data simultaneously, which can lead to issues like data inconsistency or corruption.
    public synchronized void save(){
        System.out.println("Hello");

    }
}
