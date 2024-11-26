/**
 *  Add description of app here
 *  Use "docker-compose run app" to get the interactive menu
 */

package com.napier.devops;
import java.sql.*;

public class App {
    public static void main(String[] args) {

        App a = new App();

        //New instance for Menu class
        Menu m = new Menu();

        m.menu();
    }
}

