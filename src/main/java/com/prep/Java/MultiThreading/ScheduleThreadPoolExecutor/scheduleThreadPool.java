package com.prep.Java.MultiThreading.ScheduleThreadPoolExecutor;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

public class scheduleThreadPool {
    public static void main(String[] args) {
        ScheduledExecutorService poolExecuotor = Executors.newScheduledThreadPool(5);
        poolExecuotor.submit(()->{
            try {
            Thread.sleep(5000);
                System.out.println("Task 1 executed after 5 seconds delay");
            }
            catch (Exception e){
                //
            }
            System.out.println("Task 1 executed ");
        });

        poolExecuotor.shutdown();
        System.out.println("All tasks submitted to the ScheduledExecutorService");
    }
}
