package com.napier.devops;

//import java.sql.*;

/*
will call all features from a separate files to keep the coding clean
 */

public class App {
    public static void main(String[] args) {
        // Create new Application
       // App a = new App();      //will use to call menu

        //create new instance from Connect class
        Connect c = new Connect();

        // Connect to database
        c.connect();

        //a.displayWorldDBTables()

        // Disconnect from database
        c.disconnect();
    }
}
