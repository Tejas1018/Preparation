package com.prep.DesignPatterns.Singleton;

public class DBConnectionSync {
    private static DBConnectionSync  dbConnectionSync;
    private DBConnectionSync() {

    }
    public static synchronized DBConnectionSync getInstance() {
        if (dbConnectionSync == null) {
            dbConnectionSync = new DBConnectionSync();
        }
        return dbConnectionSync;
    }
}

//Created the object inside the getInstance() where that method is synchronized means only
//One thread will acquire lock and unlock when object gets created
//DisAdvantage is that due to synchronized keyword program is very very slow due to
//Lock and unlocking mechanism for each thread.
