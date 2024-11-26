package com.napier.devops;

import java.util.Scanner;

public class Menu {
    //App a = new App();
    Methods m = new Methods();

    public void menu()
    {
        /* Connect to DB */
        m.connect();

        /* to accept user choices */
        Scanner userInput = new Scanner(System.in);
        int userChoice; //to save the option by the user

        do {
            //Menu
            System.out.println("Enter the # of the Report you want to run and press 'Enter':");   //start of menu.
            //Menu Options
            System.out.println("1. All Countries by Population");
            //System.out.println("2. All Countries By Population");
            System.out.println("0. Exit");
            System.out.println("1234. Test Database (Show Tables on World DB)");
            userChoice = userInput.nextInt();   //Read user input
            userInput.nextLine();   //Save the user input

            switch (userChoice) {
                /* Reports */
                case 1:
                    m.allCountriesByPop();
                    break;



                //exit
                case 0:
                    System.out.println("Exiting...");
                    m.disconnect();
                    break;

                /* Test DB */
                case 1234:
                    m.showWorldDBTables();
                    break;

                default:
                    System.out.println("Invalid entry, try again.");
            }
        } while (userChoice != 0);
        userInput.close();
    }
}
