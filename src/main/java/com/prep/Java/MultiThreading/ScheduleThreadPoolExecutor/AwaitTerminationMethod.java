package com.prep.Java.MultiThreading.ScheduleThreadPoolExecutor;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class AwaitTerminationMethod {
    public static void main(String[] args) throws InterruptedException {

        ScheduledExecutorService poolExecuotor = Executors.newScheduledThreadPool(5);
        poolExecuotor.submit(()->{
            try {
                Thread.sleep(5000);
                System.out.println("Task 1 executed after 5 seconds delay");
            } catch (Exception e) {
                // Handle exception
            }
            System.out.println("Task 1 executed ");
        });
        poolExecuotor.shutdown();
        try {
            boolean isExecuted = poolExecuotor.awaitTermination(3, TimeUnit.SECONDS);
            System.out.println("isExecuted : " + isExecuted);
        }
        catch(Exception e){
            //
        }
    }
}
