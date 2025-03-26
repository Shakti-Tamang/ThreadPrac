package com.company;

import java.util.ArrayList;
import java.util.List;
//import java.util.function.Function;


public class Main {

    public static void main(String[] args) {
	// write your code here

        Thraed1 t1=new Thraed1();
        t1.start();


//        try{
//   t1.stop();
//        }
//        catch (Exception ex){
//            System.out.println(ex);
//        }




        new ThreadRunnable("1st");
        new ThreadRunnable("2nd");
        new ThreadRunnable("3rd");

        try{
            Thread.sleep(8000);
        }
        catch (InterruptedException ex){
            System.out.println(ex);
        }




//        ThreadRunnable threadRunnable=new ThreadRunnable();
//        Thread thread=new Thread(threadRunnable);
//        thread.start();

        List<String>list=new ArrayList<String>();

        list.add("shakti");
        list.add("anu");
        list.add("aman");

//        not supportged

//        Function<Long,Long> am= a->a+7;
        }

    }
