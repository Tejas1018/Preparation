package com.LLD.DesignPatterns.Singleton;

public class DBConnectionEagerInit {
    private static DBConnectionEagerInit dbConnectionEagerInit;
    private DBConnectionEagerInit() {

    }
    public static DBConnectionEagerInit getInstance() {
        if(dbConnectionEagerInit == null) {
            dbConnectionEagerInit = new DBConnectionEagerInit();
        }
        return dbConnectionEagerInit;
    }
}

// Create the object and if obj is not created for very first time create it.
// Else return the existing object
//DisAdvantage is If two threads tries to create an object at the same time two objects will get created

