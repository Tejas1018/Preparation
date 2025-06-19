package com.prep.Java.MultiThreading.ScheduleThreadPoolExecutor;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

public class shutDownNowMethod {
    public static void main(String[] args) {
        ScheduledExecutorService poolObj = Executors.newScheduledThreadPool(3);

        poolObj.submit(()->{
            try{
                Thread.sleep(5000);
                System.out.println("Task 1 executed after 5 seconds delay");
            } catch (Exception e) {
                //
            }
            System.out.println("Task 1 executed ");
        });
        poolObj.shutdownNow();
        System.out.println("Main Thread completed");
    }
}
// Stops the Thread/Interrupts the thread abruptly
// The task will not be executed if it is not completed before shutdownNow is called
