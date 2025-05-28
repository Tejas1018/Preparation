package com.LLD.DesignPatterns.Singleton;

public class DBConnectionLazyInit {
    private static DBConnectionLazyInit dbConnection = new DBConnectionLazyInit();
    private DBConnectionLazyInit() {
        //To not to access outside of this class
    }
    public static DBConnectionLazyInit getInstance() {
        return dbConnection;
    }
}

//Create and Initialize the dbConnection object at the start of the program
//Return the obj.
//DisAdvantage is object is created even if we dont use that object make a memory issue
