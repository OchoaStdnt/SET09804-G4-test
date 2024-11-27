package com.napier.devops;

import java.util.Scanner;

public class Menu {
    //App a = new App();
    Methods m = new Methods();

    public void menu()
    {
        /* Connect to DB */
        m.connect();

        /* add colors to the system out */
        final String RESET = "\u001B[0m";
        final String GREEN = "\u001B[32m";
        final String RED = "\u001B[31m";
        final String YELLOW = "\u001B[33m";

        /* to accept user choices */
        Scanner userInput = new Scanner(System.in);
        int userChoice; //to save the option by the user

        do {
            /* Menu */
            System.out.println();
            System.out.println(GREEN + "Enter the # of the Report you want to run and press 'Enter':" + RESET);   //start of menu.

            /* Menu Options */
            System.out.println("1. All Countries by Population from largest to smallest");   //Added by Angel Ochoa
            System.out.println("2. All Countries by Continent (Asia) from largest to smallest");  //Added by Donisio Rash
            System.out.println("8. All Cities by Continent (Asia) from largest to smallest");    //Added by John Chimezie
            System.out.println("15. Top Populated Cities by Region (Assuming user entered 5)"); //Added by Bernard Daniel Young
            System.out.println("21. Top Populated Cities by Continent (Assuming user entered 5)");  //Added by Kenneth Ramirez
            System.out.println("0. Exit");  //Added by Angel Ochoa
            System.out.println(YELLOW + "1234. TEST DATABASE (Show Tables on World DB)" + RESET);   //Added by Angel Ochoa
            userChoice = userInput.nextInt();   //Read user input
            userInput.nextLine();   //Save the user input
            System.out.println();

            switch (userChoice) {
                /* Reports */
                case 1:
                    m.allCountriesByPop();
                    break;
                case 2:
                    m.countriesByContinent();
                    break;

                case 8:
                    m.citiesByContinent();
                    break;

                case 15:
                    m.topPopCitiesByRegion();
                    break;

                case 21:
                    m.topPopCapitalCitiesByContinent();
                    break;

                /* exit */
                case 0:
                    System.out.println(RED + "Exiting..." + RESET);
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
