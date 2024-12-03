/**
 *  Add description of app here
 *  Use "docker-compose run app" to get the interactive menuFDFD
 */

package com.napier.devops;
import java.io.IOException;
import java.sql.*;

public class App {
    public static void main(String[] args) throws IOException {

        App a = new App();
        Methods me = new Methods();

        //New instance for Menu class
        Menu m = new Menu();

        //Lab 7 test NOT working
        //me.connectToDatabase(args);

        m.menu();


    }
}

