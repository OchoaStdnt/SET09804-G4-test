/**
 *  Add description of app here
 *  Use "docker-compose run app" to get the interactive menu
 */

package com.napier.devops;
import java.sql.*;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        App a = new App();

        menu();
    }

    public static void menu()
    {
        /* Connect to DB */
        connect();

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
            System.out.println();   //Blank line
            System.out.println(GREEN + "Enter the # of the Report you want to run and press 'Enter':" + RESET);   //start of menu.
            System.out.println(GREEN + "Note all reports are displayed in order of population from largest to smallest." + RESET);   //start of menu.
            System.out.println(GREEN + "-------------------------------------------------------------------------------" + RESET);   //start of menu.

            /* Menu Options */
            System.out.println("1. All Countries in World from largest to smallest");   //Added by Angel Ochoa COMPLETED
            System.out.println("2. All Countries by Continent (Asia) from largest to smallest");  //Added by Donisio Rash COMPLETED
            System.out.println("3. All Countries by Region (Caribbean) from largest to smallest");  //Added by Donisio Rash

            System.out.println("4. Top Populated Countries in World from largest to smallest");  //Added by Donisio Rash
            System.out.println("5. Top Populated Countries by Continent (Asia) from largest to smallest");  //Added by Donisio Rash
            System.out.println("6. Top Populated Countries by Region (Caribbean) from largest to smallest");  //Added by Donisio Rash

            System.out.println("7. All Cities in World from largest to smallest");    //Added by Angel Ochoa
            System.out.println("8. All Cities by Continent (Asia) from largest to smallest");    //Added by John Chimezie COMPLETED
            System.out.println("9. All Cities by Region (Caribbean) from largest to smallest");    //Added by John Chimezie
            System.out.println("10. All Cities by Country (United States) from largest to smallest");    //Added by John Chimezie
            System.out.println("11. All Cities by District (Kabol) from largest to smallest");    //Added by John Chimezie

            System.out.println("12. Top Populated Cities in World from largest to smallest");    //Added by John Chimezie
            System.out.println("13. Top Populated Cities by Continent (Asia) from largest to smallest");    //Added by Angel Ochoa
            System.out.println("14. Top Populated Cities by Region (Caribbean) from largest to smallest");    //Added by Angel Ochoa
            System.out.println("15. Top Populated Cities by Country (United States) from largest to smallest");  //Added by Bernard Young COMPLETED
            System.out.println("16. Top Populated Cities by District (Kabol) from largest to smallest");  //Added by Bernard Young

            System.out.println("17. All Capital Cities in World from largest to smallest");  //Added by Bernard Young
            System.out.println("18. All Capital Cities by Continent (Asia) from largest to smallest");  //Added by Bernard Young
            System.out.println("19. All Capital Cities by Region (Caribbean) from largest to smallest");  //Added by Bernard Young

            System.out.println("20. Top Populated Capital Cities by World from largest to smallest");  //Added by Angel Ochoa
            System.out.println("21. Top Populated Capital Cities by Continent (Asia) from largest to smallest");  //Added by Kenneth Ramirez COMPLETED
            System.out.println("22. Top Populated Capital Cities by Region (Southeast Asia) from largest to smallest");  //Added by Kenneth Ramirez

            System.out.println("23. The population of people, people in Cities, and people not living in cities by each Continent");  //Added by Kenneth Ramirez
            System.out.println("24. The population of people, people in Cities, and people not living in cities by each Region");  //Added by Kenneth Ramirez
            System.out.println("25. The population of people, people in Cities, and people not living in cities by each Country");  //Added by Kenneth Ramirez

            System.out.println("26. The population of the World");  //Added by Angel Ochoa
            System.out.println("27. The population of a Continent (Asia)");  //Added by Angel Ochoa
            System.out.println("28. The population of a Region (Western Europe)");  //Added by Angel Ochoa
            System.out.println("29. The population of a Country (France)");  //Added by Angel Ochoa
            System.out.println("30. The population of a District (California)");  //Added by Angel Ochoa
            System.out.println("31. The population of a City (Tokyo)");  //Added by Angel Ochoa

            System.out.println("32. The population that speak Chinese, English, Hindi, Spanish, and Arabic");  //Added by Angel Ochoa

            /* Exit Menu/Application */
            System.out.println("0. Exit");  //Added by Angel Ochoa

            /* Test DB */
            System.out.println(YELLOW + "1234. TEST DATABASE (Show Tables on World DB)" + RESET);   //Added by Angel Ochoa
            userChoice = userInput.nextInt();   //Read user input
            userInput.nextLine();   //Save the user input
            System.out.println();   //Blank line

            switch (userChoice) {
                /* Reports */
                case 1: //Angel Ochoa
                    allCountriesByPop();
                    break;
                case 2: //Donisio Rash
                    countriesByContinent();
                    break;
                case 3: //Donisio Rash
                    countriesByRegion();
                    break;

                case 4: //Donisio Rash
                    topPopCountriesInWorld();
                    break;
                case 5: //Donisio Rash
                    topPopCountriesByContinent();
                    break;
                case 6: //Donisio Rash
                    topPopCountriesByRegion();
                    break;

                case 7: //Angel Ochoa
                    citiesByWorld();
                    break;
                case 8: //John Chimezie
                    citiesByContinent();
                    break;
                case 9: //John Chimezie
                    citiesByRegion();
                    break;
                case 10: //John Chimezie
                    citiesByCountry();
                    break;
                case 11: //John Chimezie
                    citiesByDistrict();
                    break;

                case 12: //John Chimezie
                    topPopCitiesInWorld();
                    break;
                case 13: //Angel Ochoa
                    topPopCitiesbyContinent();
                    break;
                case 14: //Angel Ochoa
                    topPopCitiesbyRegion();
                    break;
                case 15: //Bernard Young
                    topPopCitiesByCountry();
                    break;
                case 16: //Bernard Young
                    topPopCitiesByDistrict();
                    break;

                case 17: //Bernard Young
                    allCapCitiesWorld();
                    break;
                case 18: //Bernard Young
                    allCapCitiesByContinent();
                    break;
                case 19: //Bernard Young
                    allCapCitiesByRegion();
                    break;

                case 20: //Angel Ochoa
                    topPopCapitalCitiesWorld();
                    break;
                case 21: //Kenneth Ramirez
                    topPopCapitalCitiesByContinent();
                    break;
                case 22: //Kenneth Ramirez
                    topPopCapitalCitiesByRegion();
                    break;

                case 23: //Kenneth Ramirez
                    popOfPplPplCitiesPplNotCityByContinent();
                    break;
                case 24: //Kenneth Ramirez
                    popOfPplPplCitiesPplNotCityByRegion();
                    break;
                case 25: //Kenneth Ramirez
                    popOfPplPplCitiesPplNotCityByCountry();
                    break;

                case 26: //Angel Ochoa
                    popOfWorld();
                    break;
                case 27: //Angel Ochoa
                    popOfContinent();
                    break;
                case 28: //Angel Ochoa
                    popOfRegion();
                    break;
                case 29: //Angel Ochoa
                    popOfCountry();
                    break;
                case 30: //Angel Ochoa
                    popOfDistrict();
                    break;
                case 31: //Angel Ochoa
                    popOfCity();
                    break;

                case 32: //Angel Ochoa
                    popOfLang();
                    break;

                /* exit */
                case 0:
                    System.out.println(RED + "Exiting..." + RESET);
                    disconnect();
                    break;

                /* Test DB */
                case 1234:
                    showWorldDBTables();
                    break;

                default:
                    System.out.println("Invalid entry, try again.");
            }
        } while (userChoice != 0);
        userInput.close();
    }

    private static Connection con = null;

    /* add colors to the system out */
    static final String RESET = "\u001B[0m";
    static final String BLUE = "\u001B[34m";
    static final String GREEN = "\u001B[32m";
    static final String RED = "\u001B[31m";

    //-------------- Method 1 - All Countries by Population ------------------
    //-------------- Angel Ochoa --------------------
    public static void allCountriesByPop()
    {
        try
        {
            /* Create an SQL statement */
            Statement stmt = con.createStatement();
            /* Create string for SQL statement */
            String strSelect =
                    /* SQL query */
                    "SELECT Code, "
                            + "Name AS country_name, "
                            + "Continent, "
                            + "Region, "
                            + "Population, "
                            + "Capital "
                            + "FROM country "
                            + "ORDER BY Population DESC";
            /* Execute SQL statement */
            ResultSet rset = stmt.executeQuery(strSelect);

            /* Report Name */
            System.out.println(GREEN + "All Countries by Population:" + RESET);

            /* Header in SQL style */
            System.out.printf("%-5s %-50s %-20s %-40s %-15s %-6s%n", "Code", "Country Name", "Continent", "Region", "Population", "Capital");
            System.out.println("----------------------------------------------------------------------------------------------------------------------------------------");    //add - depending on the values of the spacing

            /* Print data */
            while (rset.next()) {
                String countryCode = rset.getString("Code");
                String countryName = rset.getString("country_name");
                String conti = rset.getString("Continent");
                String regn = rset.getString("Region");
                int population = rset.getInt("Population");
                int countryCapital = rset.getInt("Capital");
                System.out.printf("%-5s %-50s %-20s %-40s %-15d %-6d%n", countryCode, countryName, conti, regn, population, countryCapital);
            }

        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    //------------------ END Method 1 ------------------------------

    //-------------- Method 2 - All countries by continent (Using Asia)------------------
    //-------------- Donisio Rash --------------------
    public static void countriesByContinent()
    {
        try
        {
            /* Create an SQL statement */
            Statement stmt = con.createStatement();
            /* Create string for SQL statement */
            String strSelect =
                    /* SQL query */
                    "SELECT Code, "
                            + "Name AS country_name, "
                            + "Continent, "
                            + "Region, "
                            + "Population, "
                            + "Capital "
                            + "FROM country "
                            + "WHERE Continent = 'Asia' "   //Asia can be changed to another Continent
                            + "ORDER BY Population DESC";
            /* Execute SQL statement */
            ResultSet rset = stmt.executeQuery(strSelect);

            /* Report Name */
            System.out.println(GREEN + "All countries by continent (Using Asia):" + RESET);

            /* Header in SQL style */
            System.out.printf("%-5s %-50s %-20s %-40s %-15s %-6s%n", "Code", "Country Name", "Continent", "Region", "Population", "Capital");
            System.out.println("----------------------------------------------------------------------------------------------------------------------------------------");    //add - depending on the values of the spacing

            /* Print data */
            while (rset.next()) {
                String countryCode = rset.getString("Code");
                String countryName = rset.getString("country_name");
                String conti = rset.getString("Continent");
                String regn = rset.getString("Region");
                int population = rset.getInt("Population");
                int countryCapital = rset.getInt("Capital");
                System.out.printf("%-5s %-50s %-20s %-40s %-15d %-6d%n", countryCode, countryName, conti, regn, population, countryCapital);
            }

        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    //------------------ END Method 2 ------------------------------

    //-------------- Method 3 - All countries by Region ------------------
    //-------------- Donisio Rash --------------------
    public static void countriesByRegion()
    {
        try
        {
            /* Create an SQL statement */
            Statement stmt = con.createStatement();
            /* Create string for SQL statement */
            String strSelect =
                    /* SQL query */
                    "SELECT Code, "
                            + "Name AS country_name, "
                            + "Continent, "
                            + "Region, "
                            + "Population, "
                            + "Capital "
                            + "FROM country "
                            + "WHERE Region = 'Caribbean' "   //Caribbean can be changed to another region
                            + "ORDER BY Population DESC";
            /* Execute SQL statement */
            ResultSet rset = stmt.executeQuery(strSelect);

            /* Report Name */
            System.out.println(GREEN + "All countries by Region:" + RESET);

            /* Header in SQL style */
            System.out.printf("%-5s %-50s %-20s %-40s %-15s %-6s%n", "Code", "Country Name", "Continent", "Region", "Population", "Capital");
            System.out.println("----------------------------------------------------------------------------------------------------------------------------------------");    //add - depending on the values of the spacing

            /* Print data */
            while (rset.next()) {
                String countryCode = rset.getString("Code");
                String countryName = rset.getString("country_name");
                String conti = rset.getString("Continent");
                String regn = rset.getString("Region");
                int population = rset.getInt("Population");
                int countryCapital = rset.getInt("Capital");
                System.out.printf("%-5s %-50s %-20s %-40s %-15d %-6d%n", countryCode, countryName, conti, regn, population, countryCapital);
            }

        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    //------------------ END Method 3 ------------------------------

    //-------------- Method 4 - Top populated countries in world ------------------
    //-------------- Donisio Rash --------------------
    public static void topPopCountriesInWorld() {
        int userVal = getNum(); // for N value
        try {
            /* Create an SQL statement */
            Statement stmt = con.createStatement();
            /* Create string for SQL statement */
            String strSelect =
                    /* SQL query */
                    "SELECT Code, "
                            + "Name AS country_name, "
                            + "Continent, "
                            + "Region, "
                            + "Population, "
                            + "Capital "
                            + "FROM country "
                            + "ORDER BY Population DESC "
                            + "LIMIT " + userVal;   //limit display
            /* Execute SQL statement */
            ResultSet rset = stmt.executeQuery(strSelect);

            /* Report Name */
            System.out.println(GREEN + "Top populated countries in world:" + RESET);

            /* Header in SQL style */
            System.out.printf("%-5s %-50s %-20s %-40s %-15s %-6s%n", "Code", "Country Name", "Continent", "Region", "Population", "Capital");
            System.out.println("----------------------------------------------------------------------------------------------------------------------------------------");    //add - depending on the values of the spacing

            /* Print data */
            while (rset.next()) {
                String countryCode = rset.getString("Code");
                String countryName = rset.getString("country_name");
                String conti = rset.getString("Continent");
                String regn = rset.getString("Region");
                int population = rset.getInt("Population");
                int countryCapital = rset.getInt("Capital");
                System.out.printf("%-5s %-50s %-20s %-40s %-15d %-6d%n", countryCode, countryName, conti, regn, population, countryCapital);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    //------------------ END Method 4 ------------------------------

    //-------------- Method 5 - Top populated countries by Continent ------------------
    //-------------- Donisio Rash --------------------
    public static void topPopCountriesByContinent() {
        int userVal = getNum(); // for N value
        try {
            /* Create an SQL statement */
            Statement stmt = con.createStatement();
            /* Create string for SQL statement */
            String strSelect =
                    /* SQL query */
                    "SELECT Code, "
                            + "Name AS country_name, "
                            + "Continent, "
                            + "Region, "
                            + "Population, "
                            + "Capital "
                            + "FROM country "
                            + "WHERE Continent = 'Asia' "   //Asia can be changed to another Continent
                            + "ORDER BY Population DESC "
                            + "LIMIT " + userVal;   //limit display
            /* Execute SQL statement */
            ResultSet rset = stmt.executeQuery(strSelect);

            /* Report Name */
            System.out.println(GREEN + "Top populated countries by Continent:" + RESET);

            /* Header in SQL style */
            System.out.printf("%-5s %-50s %-20s %-40s %-15s %-6s%n", "Code", "Country Name", "Continent", "Region", "Population", "Capital");
            System.out.println("----------------------------------------------------------------------------------------------------------------------------------------");    //add - depending on the values of the spacing

            /* Print data */
            while (rset.next()) {
                String countryCode = rset.getString("Code");
                String countryName = rset.getString("country_name");
                String conti = rset.getString("Continent");
                String regn = rset.getString("Region");
                int population = rset.getInt("Population");
                int countryCapital = rset.getInt("Capital");
                System.out.printf("%-5s %-50s %-20s %-40s %-15d %-6d%n", countryCode, countryName, conti, regn, population, countryCapital);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    //------------------ END Method 5 ------------------------------

    //-------------- Method 6 - Top populated countries by Region ------------------
    //-------------- Donisio Rash --------------------
    public static void topPopCountriesByRegion() {
        int userVal = getNum(); // for N value
        try {
            /* Create an SQL statement */
            Statement stmt = con.createStatement();
            /* Create string for SQL statement */
            String strSelect =
                    /* SQL query */
                    "SELECT Code, "
                            + "Name AS country_name, "
                            + "Continent, "
                            + "Region, "
                            + "Population, "
                            + "Capital "
                            + "FROM country "
                            + "WHERE Region = 'Caribbean' "   //Caribbean can be changed to another Region
                            + "ORDER BY Population DESC "
                            + "LIMIT " + userVal;   //limit display
            /* Execute SQL statement */
            ResultSet rset = stmt.executeQuery(strSelect);

            /* Report Name */
            System.out.println(GREEN + "Top populated countries by Region:" + RESET);

            /* Header in SQL style */
            System.out.printf("%-5s %-50s %-20s %-40s %-15s %-6s%n", "Code", "Country Name", "Continent", "Region", "Population", "Capital");
            System.out.println("----------------------------------------------------------------------------------------------------------------------------------------");    //add - depending on the values of the spacing

            /* Print data */
            while (rset.next()) {
                String countryCode = rset.getString("Code");
                String countryName = rset.getString("country_name");
                String conti = rset.getString("Continent");
                String regn = rset.getString("Region");
                int population = rset.getInt("Population");
                int countryCapital = rset.getInt("Capital");
                System.out.printf("%-5s %-50s %-20s %-40s %-15d %-6d%n", countryCode, countryName, conti, regn, population, countryCapital);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    //------------------ END Method 6 ------------------------------

    //-------------- Method 7 - All Cities in World ------------------
    //-------------- Angel Ochoa --------------------
    public static void citiesByWorld()
    {
        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    //SQL query
                    "SELECT ci.Name AS city_name, "
                            + "c.Name AS country_name, " //country name
                            + "ci.District, "
                            + "ci.Population "
                            + "FROM city ci "
                            + "JOIN country c ON ci.CountryCode = c.Code "
                            + "ORDER BY ci.Population DESC";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);

            //Report Name
            System.out.println(GREEN + "All Cities in World:" + RESET);

            // Header in SQL style
            System.out.printf("%-50s %-50s %-40s %-15s%n", "City Name", "Country", "District", "Population");
            System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------");    //add - depending on the values of the spacing

            //Print data
            while (rset.next()) {
                String cityName = rset.getString("city_name");
                String Country = rset.getString("country_name");
                String District = rset.getString("ci.District");
                int population = rset.getInt("ci.Population");
                System.out.printf("%-50s %-50s %-40s %-15d%n", cityName, Country, District, population);
            }

        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    //------------------ END Method 7 ------------------------------

    //-------------- Method 8 - All Cities by Continent ------------------
    //-------------- John Chimezie --------------------
    public static void citiesByContinent()
    {
        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    //SQL query
                    "SELECT ci.Name AS city_name, "
                            + "c.Name AS country_name, " //country name
                            + "ci.District, "
                            + "ci.Population "
                            + "FROM city ci "
                            + "JOIN country c ON ci.CountryCode = c.Code "
                            + "WHERE c.Continent = 'Asia' "   //Asia can be changed to another Continent
                            + "ORDER BY ci.Population DESC";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);

            //Report Name
            System.out.println(GREEN + "All Cities by Continent:" + RESET);

            // Header in SQL style
            System.out.printf("%-50s %-50s %-40s %-15s%n", "City Name", "Country", "District", "Population");
            System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------");    //add - depending on the values of the spacing

            //Print data
            while (rset.next()) {
                String cityName = rset.getString("city_name");
                String Country = rset.getString("country_name");
                String District = rset.getString("ci.District");
                int population = rset.getInt("ci.Population");
                System.out.printf("%-50s %-50s %-40s %-15d%n", cityName, Country, District, population);
            }

        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    //------------------ END Method 8 ------------------------------

    //-------------- Method 9 - All All Cities by Region ------------------
    //-------------- John Chimezie --------------------
    public static void citiesByRegion()
    {
        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    //SQL query
                    "SELECT ci.Name AS city_name, "
                            + "c.Name AS country_name, " //country name
                            + "ci.District, "
                            + "ci.Population "
                            + "FROM city ci "
                            + "JOIN country c ON ci.CountryCode = c.Code "
                            + "WHERE c.Region = 'Caribbean' "   //Caribbean can be changed to another Region
                            + "ORDER BY ci.Population DESC";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);

            //Report Name
            System.out.println(GREEN + "All Cities by Region:" + RESET);

            // Header in SQL style
            System.out.printf("%-50s %-50s %-40s %-15s%n", "City Name", "Country", "District", "Population");
            System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------");    //add - depending on the values of the spacing

            //Print data
            while (rset.next()) {
                String cityName = rset.getString("city_name");
                String Country = rset.getString("country_name");
                String District = rset.getString("ci.District");
                int population = rset.getInt("ci.Population");
                System.out.printf("%-50s %-50s %-40s %-15d%n", cityName, Country, District, population);
            }

        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    //------------------ END Method 9 ------------------------------

    //-------------- Method 10 - All All Cities by Country ------------------
    //-------------- John Chimezie --------------------
    public static void citiesByCountry()
    {
        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    //SQL query
                    "SELECT ci.Name AS city_name, "
                            + "c.Name AS country_name, " //country name
                            + "ci.District, "
                            + "ci.Population "
                            + "FROM city ci "
                            + "JOIN country c ON ci.CountryCode = c.Code "
                            + "WHERE c.Name = 'United States' "   //United States can be changed
                            + "ORDER BY ci.Population DESC";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);

            //Report Name
            System.out.println(GREEN + "All All Cities by Country:" + RESET);

            // Header in SQL style
            System.out.printf("%-50s %-50s %-40s %-15s%n", "City Name", "Country", "District", "Population");
            System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------");    //add - depending on the values of the spacing

            //Print data
            while (rset.next()) {
                String cityName = rset.getString("city_name");
                String Country = rset.getString("country_name");
                String District = rset.getString("ci.District");
                int population = rset.getInt("ci.Population");
                System.out.printf("%-50s %-50s %-40s %-15d%n", cityName, Country, District, population);
            }

        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    //------------------ END Method 10 ------------------------------

    //-------------- Method 11 - All Cities by District ------------------
    //-------------- John Chimezie --------------------
    public static void citiesByDistrict()
    {
        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    //SQL query
                    "SELECT ci.Name AS city_name, "
                            + "c.Name AS country_name, " //country name
                            + "ci.District, "
                            + "ci.Population "
                            + "FROM city ci "
                            + "JOIN country c ON ci.CountryCode = c.Code "
                            + "WHERE ci.District = 'Kabol' "   //Kabol can be changed
                            + "ORDER BY ci.Population DESC";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);

            //Report Name
            System.out.println(GREEN + "All Cities by District:" + RESET);

            // Header in SQL style
            System.out.printf("%-50s %-50s %-40s %-15s%n", "City Name", "Country", "District", "Population");
            System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------");    //add - depending on the values of the spacing

            //Print data
            while (rset.next()) {
                String cityName = rset.getString("city_name");
                String Country = rset.getString("country_name");
                String District = rset.getString("ci.District");
                int population = rset.getInt("ci.Population");
                System.out.printf("%-50s %-50s %-40s %-15d%n", cityName, Country, District, population);
            }

        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    //------------------ END Method 11 ------------------------------

    //-------------- Method 12 - Top Populated Cities in World ------------------
    //-------------- John Chimezie --------------------
    public static void topPopCitiesInWorld()
    {
        int userVal = getNum(); // for N value
        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    //SQL query
                    "SELECT ci.Name AS city_name, "
                            + "c.Name AS country_name, " //country name
                            + "ci.District, "
                            + "ci.Population "
                            + "FROM city ci "
                            + "JOIN country c ON ci.CountryCode = c.Code "
                            + "ORDER BY ci.Population DESC "
                            + "LIMIT " + userVal;
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);

            //Report Name
            System.out.println(GREEN + "Top Populated Cities in World:" + RESET);

            // Header in SQL style
            System.out.printf("%-50s %-50s %-40s %-15s%n", "City Name", "Country", "District", "Population");
            System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------");    //add - depending on the values of the spacing

            //Print data
            while (rset.next()) {
                String cityName = rset.getString("city_name");
                String Country = rset.getString("country_name");
                String District = rset.getString("ci.District");
                int population = rset.getInt("ci.Population");
                System.out.printf("%-50s %-50s %-40s %-15d%n", cityName, Country, District, population);
            }

        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    //------------------ END Method 12 ------------------------------

    //-------------- Method 13 - Top Populated Cities by Continent ------------------
    //-------------- Angel Ochoa --------------------
    public static void topPopCitiesbyContinent()
    {
        int userVal = getNum(); // for N value
        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    //SQL query
                    "SELECT ci.Name AS city_name, "
                            + "c.Name AS country_name, " //country name
                            + "ci.District, "
                            + "ci.Population "
                            + "FROM city ci "
                            + "JOIN country c ON ci.CountryCode = c.Code "
                            + "WHERE c.Continent = 'Asia' " //Asia can be changed
                            + "ORDER BY ci.Population DESC "
                            + "LIMIT " + userVal;    //limit display
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);

            //Report Name
            System.out.println(GREEN + "Top Populated Cities by Continent:" + RESET);

            // Header in SQL style
            System.out.printf("%-50s %-50s %-40s %-15s%n", "City Name", "Country", "District", "Population");
            System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------");    //add - depending on the values of the spacing

            //Print data
            while (rset.next()) {
                String cityName = rset.getString("city_name");
                String Country = rset.getString("country_name");
                String District = rset.getString("ci.District");
                int population = rset.getInt("ci.Population");
                System.out.printf("%-50s %-50s %-40s %-15d%n", cityName, Country, District, population);
            }

        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    //------------------ END Method 13 ------------------------------

    //-------------- Method 14 - Top Populated Cities by Region ------------------
    //-------------- Angel Ochoa --------------------
    public static void topPopCitiesbyRegion()
    {
        int userVal = getNum(); // for N value
        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    //SQL query
                    "SELECT ci.Name AS city_name, "
                            + "c.Name AS country_name, " //country name
                            + "ci.District, "
                            + "ci.Population "
                            + "FROM city ci "
                            + "JOIN country c ON ci.CountryCode = c.Code "
                            + "WHERE c.Region = 'Caribbean' " //Caribbean can be changed
                            + "ORDER BY ci.Population DESC "
                            + "LIMIT " + userVal;    //limit display
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);

            //Report Name
            System.out.println(GREEN + "Top Populated Cities by Region:" + RESET);

            // Header in SQL style
            System.out.printf("%-50s %-50s %-40s %-15s%n", "City Name", "Country", "District", "Population");
            System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------");    //add - depending on the values of the spacing

            //Print data
            while (rset.next()) {
                String cityName = rset.getString("city_name");
                String Country = rset.getString("country_name");
                String District = rset.getString("ci.District");
                int population = rset.getInt("ci.Population");
                System.out.printf("%-50s %-50s %-40s %-15d%n", cityName, Country, District, population);
            }

        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    //------------------ END Method 14 ------------------------------

    //-------------- Method 15 - Top Populated Cities by Country ------------------
    //-------------- Bernard Daniel Young --------------------
    public static void topPopCitiesByCountry()
    {
        int userVal = getNum(); // for N value
        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    //SQL query
                    "SELECT ci.Name AS city_name, "
                            + "c.Name AS country_name, " //country name
                            + "ci.District, "
                            + "ci.Population "
                            + "FROM city ci "
                            + "JOIN country c ON ci.CountryCode = c.Code "
                            + "WHERE c.Name = 'United States' "   //United States can be changed to another Country
                            + "ORDER BY ci.Population DESC "
                            + "LIMIT " + userVal;    //limit display
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);

            //Report Name
            System.out.println(GREEN + "Top Populated Cities by Country:" + RESET);

            // Header in SQL style
            System.out.printf("%-50s %-50s %-40s %-15s%n", "City Name", "Country", "District", "Population");
            System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------");    //add - depending on the values of the spacing

            //Print data
            while (rset.next()) {
                String cityName = rset.getString("city_name");
                String Country = rset.getString("country_name");
                String District = rset.getString("ci.District");
                int population = rset.getInt("ci.Population");
                System.out.printf("%-50s %-50s %-40s %-15d%n", cityName, Country, District, population);
            }

        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    //------------------ END Method 15 ------------------------------

    //-------------- Method 16 - Top Populated Cities by District ------------------
    //-------------- Bernard Daniel Young --------------------
    public static void topPopCitiesByDistrict()
    {
        int userVal = getNum(); // for N value
        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    //SQL query
                    "SELECT ci.Name AS city_name, "
                            + "c.Name AS country_name, " //country name
                            + "ci.District, "
                            + "ci.Population "
                            + "FROM city ci "
                            + "JOIN country c ON ci.CountryCode = c.Code "
                            + "WHERE ci.District = 'Kabol' "   //Kabol can be changed
                            + "ORDER BY ci.Population DESC "
                            + "LIMIT " + userVal;    //limit display
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);

            //Report Name
            System.out.println(GREEN + "Top Populated Cities by District:" + RESET);

            // Header in SQL style
            System.out.printf("%-50s %-50s %-40s %-15s%n", "City Name", "Country", "District", "Population");
            System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------");    //add - depending on the values of the spacing

            //Print data
            while (rset.next()) {
                String cityName = rset.getString("city_name");
                String Country = rset.getString("country_name");
                String District = rset.getString("ci.District");
                int population = rset.getInt("ci.Population");
                System.out.printf("%-50s %-50s %-40s %-15d%n", cityName, Country, District, population);
            }

        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    //------------------ END Method 16 ------------------------------

    //-------------- Method 17 - All Capital Cities in World ------------------
    //-------------- Bernard Daniel Young --------------------
    public static void allCapCitiesWorld()
    {
        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    //SQL query
                    "SELECT ci.Name AS capital_city, "
                            + "c.Name AS country_name, "
                            + "ci.Population "
                            + "FROM country c "
                            + "JOIN city ci ON c.Capital = ci.ID "
                            + "ORDER BY ci.Population DESC";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);

            //Report Name
            System.out.println(GREEN + "All Capital Cities in World:" + RESET);

            // Header in SQL style
            System.out.printf("%-50s %-50s %-15s%n", "City Name", "Country", "Population");
            System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------");    //add - depending on the values of the spacing

            //Print data
            while (rset.next()) {
                String cityName = rset.getString("capital_city");
                String Country = rset.getString("country_name");
                int population = rset.getInt("ci.Population");
                System.out.printf("%-50s %-50s %-15d%n", cityName, Country, population);
            }

        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    //------------------ END Method 17 ------------------------------

    //-------------- Method 18 - All Capital Cities by Continent ------------------
    //-------------- Bernard Daniel Young --------------------
    public static void allCapCitiesByContinent()
    {
        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    //SQL query
                    "SELECT ci.Name AS capital_city, "
                            + "c.Name AS country_name, "
                            + "ci.Population "
                            + "FROM country c "
                            + "JOIN city ci ON c.Capital = ci.ID "
                            + "WHERE c.Continent = 'Asia' "   //Asia can be changed to another Continent
                            + "ORDER BY ci.Population DESC";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);

            //Report Name
            System.out.println(GREEN + "All Capital Cities by Continent:" + RESET);

            // Header in SQL style
            System.out.printf("%-50s %-50s %-15s%n", "City Name", "Country", "Population");
            System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------");    //add - depending on the values of the spacing

            //Print data
            while (rset.next()) {
                String cityName = rset.getString("capital_city");
                String Country = rset.getString("country_name");
                int population = rset.getInt("ci.Population");
                System.out.printf("%-50s %-50s %-15d%n", cityName, Country, population);
            }

        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    //------------------ END Method 18 ------------------------------

    //-------------- Method 19 - All Capital Cities by Region ------------------
    //-------------- Bernard Daniel Young --------------------
    public static void allCapCitiesByRegion()
    {
        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    //SQL query
                    "SELECT ci.Name AS capital_city, "
                            + "c.Name AS country_name, "
                            + "ci.Population "
                            + "FROM country c "
                            + "JOIN city ci ON c.Capital = ci.ID "
                            + "WHERE c.Region = 'Caribbean' "   //Caribbean can be changed
                            + "ORDER BY ci.Population DESC";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);

            //Report Name
            System.out.println(GREEN + "All Capital Cities by Region:" + RESET);

            // Header in SQL style
            System.out.printf("%-50s %-50s %-15s%n", "City Name", "Country", "Population");
            System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------");    //add - depending on the values of the spacing

            //Print data
            while (rset.next()) {
                String cityName = rset.getString("capital_city");
                String Country = rset.getString("country_name");
                int population = rset.getInt("ci.Population");
                System.out.printf("%-50s %-50s %-15d%n", cityName, Country, population);
            }

        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    //------------------ END Method 19 ------------------------------

    //-------------- Method 20 - Top Populated Capital Cities in world ------------------
    //-------------- Angel Ochoa --------------------
    public static void topPopCapitalCitiesWorld()
    {
        int userVal = getNum(); // for N value
        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    //SQL query
                    "SELECT ci.Name AS capital_city, "
                            + "c.Name AS country_name, "
                            + "ci.Population "
                            + "FROM country c "
                            + "JOIN city ci ON c.Capital = ci.ID "
                            + "ORDER BY ci.Population DESC "
                            + "LIMIT " + userVal;    //limit N display
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);

            //Report Name
            System.out.println(GREEN + "Top Populated Capital Cities:" + RESET);

            // Header in SQL style
            System.out.printf("%-50s %-50s %-15s%n", "City Name", "Country", "Population");
            System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------");    //add - depending on the values of the spacing

            //Print data
            while (rset.next()) {
                String cityName = rset.getString("capital_city");
                String Country = rset.getString("country_name");
                int population = rset.getInt("ci.Population");
                System.out.printf("%-50s %-50s %-15d%n", cityName, Country, population);
            }

        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    //------------------ END Method 20 ------------------------------

    //-------------- Method 21 - Top Populated capital Cities by Continent ------------------
    //-------------- Kenneth Ramirez --------------------
    public static void topPopCapitalCitiesByContinent()
    {
        int userVal = getNum(); // for N value
        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    //SQL query
                    "SELECT ci.Name AS capital_city, "
                            + "c.Name AS country_name, "
                            + "ci.Population "
                            + "FROM country c "
                            + "JOIN city ci ON c.Capital = ci.ID "
                            + "WHERE c.Continent = 'Asia' "   //Asia can be changed to another Continent
                            + "ORDER BY ci.Population DESC "
                            + "LIMIT " + userVal;    //limit N display
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);

            //Report Name
            System.out.println(GREEN + "Top Populated Capital Cities by Continent:" + RESET);

            // Header in SQL style
            System.out.printf("%-50s %-50s %-15s%n", "City Name", "Country", "Population");
            System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------");    //add - depending on the values of the spacing

            //Print data
            while (rset.next()) {
                String cityName = rset.getString("capital_city");
                String Country = rset.getString("country_name");
                int population = rset.getInt("ci.Population");
                System.out.printf("%-50s %-50s %-15d%n", cityName, Country, population);
            }

        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    //------------------ END Method 21 ------------------------------

    //-------------- Method 22 - Top Populated Capital Cities by Region ------------------
    //-------------- Kenneth Ramirez --------------------
    public static void topPopCapitalCitiesByRegion()
    {
        int userVal = getNum(); // for N value
        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    //SQL query
                    "SELECT ci.Name AS capital_city, "
                            + "c.Name AS country_name, "
                            + "ci.Population "
                            + "FROM country c "
                            + "JOIN city ci ON c.Capital = ci.ID "
                            + "WHERE c.Region = 'Southeast Asia' "   //Southeast Asia can be changed
                            + "ORDER BY ci.Population DESC "
                            + "LIMIT " + userVal;    //limit N display
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);

            //Report Name
            System.out.println(GREEN + "Top Populated Capital Cities by Region:" + RESET);

            // Header in SQL style
            System.out.printf("%-50s %-50s %-15s%n", "City Name", "Country", "Population");
            System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------");    //add - depending on the values of the spacing

            //Print data
            while (rset.next()) {
                String cityName = rset.getString("capital_city");
                String Country = rset.getString("country_name");
                int population = rset.getInt("ci.Population");
                System.out.printf("%-50s %-50s %-15d%n", cityName, Country, population);
            }

        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    //------------------ END Method 22 ------------------------------

    //-------------- Method 23 - Population of people, people in cities, people not in cities by Continent ------------------
    //-------------- Kenneth Ramirez --------------------
    public static void popOfPplPplCitiesPplNotCityByContinent()
    {
        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    //SQL query
                    "SELECT c.Continent, "
                            + "SUM(c.Population) AS total_population, "
                            + "SUM(ci.CityPopulation) AS city_population, "
                            + "SUM(c.Population) - SUM(ci.CityPopulation) AS rural_population "
                            + "FROM country c "
                            + "LEFT JOIN "
                            + "(SELECT ct.CountryCode, "
                            + "SUM(ct.Population) AS CityPopulation "
                            + "FROM city ct "
                            + "GROUP BY ct.CountryCode) ci ON c.Code = ci.CountryCode "
                            + "GROUP BY c.Continent";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);

            //Report Name
            System.out.println(GREEN + "Population of people, people in cities, people not in cities by Continent:" + RESET);

            // Header in SQL style
            System.out.printf("%-50s %-20s %-20s %-20s%n", "Continent", "Total Population", "City Population", "Rural Population");
            System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------");    //add - depending on the values of the spacing

            //Print data
            while (rset.next()) {
                String ContinentN = rset.getString("c.Continent");
                long totPop = rset.getLong("total_population");
                long totPopCity = rset.getLong("city_population");
                long totPopRural = rset.getLong("rural_population");
                System.out.printf("%-50s %-20d %-20d %-20d%n", ContinentN, totPop, totPopCity, totPopRural);
            }

        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    //------------------ END Method 23 ------------------------------

    //-------------- Method 24 - Population of people, people in cities, people not in cities by Region ------------------
    //-------------- Kenneth Ramirez --------------------
    public static void popOfPplPplCitiesPplNotCityByRegion()
    {
        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    //SQL query
                    "SELECT c.Region, "
                            + "SUM(c.Population) AS total_population, "
                            + "SUM(ci.CityPopulation) AS city_population, "
                            + "SUM(c.Population) - SUM(ci.CityPopulation) AS rural_population "
                            + "FROM country c "
                            + "LEFT JOIN "
                            + "(SELECT ct.CountryCode, "
                            + "SUM(ct.Population) AS CityPopulation "
                            + "FROM city ct "
                            + "GROUP BY ct.CountryCode) ci ON c.Code = ci.CountryCode "
                            + "GROUP BY c.Region";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);

            //Report Name
            System.out.println(GREEN + "Population of people, people in cities, people not in cities by Region:" + RESET);

            // Header in SQL style
            System.out.printf("%-50s %-20s %-20s %-20s%n", "Region", "Total Population", "City Population", "Rural Population");
            System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------");    //add - depending on the values of the spacing

            //Print data
            while (rset.next()) {
                String regionN = rset.getString("c.Region");
                long totPop = rset.getLong("total_population");
                long totPopCity = rset.getLong("city_population");
                long totPopRural = rset.getLong("rural_population");
                System.out.printf("%-50s %-20d %-20d %-20d%n", regionN, totPop, totPopCity, totPopRural);
            }

        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    //------------------ END Method 24 ------------------------------

    //-------------- Method 25 - Population of people, people in cities, people not in cities by Country ------------------
    //-------------- Kenneth Ramirez --------------------
    public static void popOfPplPplCitiesPplNotCityByCountry()
    {
        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    //SQL query
                    "SELECT c.Name AS CountryName, "
                            + "c.Population AS total_population, "
                            + "COALESCE(ci.CityPopulation, 0) AS city_population, "
                            + "c.Population - COALESCE(ci.CityPopulation, 0) AS rural_population "
                            + "FROM country c "
                            + "LEFT JOIN "
                            + "(SELECT ct.CountryCode, "
                            + "SUM(ct.Population) AS CityPopulation "
                            + "FROM city ct "
                            + "GROUP BY ct.CountryCode) ci ON c.Code = ci.CountryCode";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);

            //Report Name
            System.out.println(GREEN + "Population of people, people in cities, people not in cities by Country:" + RESET);

            // Header in SQL style
            System.out.printf("%-50s %-20s %-20s %-20s%n", "Country Name", "Total Population", "City Population", "Rural Population");
            System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------");    //add - depending on the values of the spacing

            //Print data
            while (rset.next()) {
                String countryN = rset.getString("CountryName");
                long totPop = rset.getLong("total_population");
                long totPopCity = rset.getLong("city_population");
                long totPopRural = rset.getLong("rural_population");
                System.out.printf("%-50s %-20d %-20d %-20d%n", countryN, totPop, totPopCity, totPopRural);
            }

        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    //------------------ END Method 25 ------------------------------

    //-------------- Method 26 - Population of the world ------------------
    //-------------- Angel Ochoa --------------------
    public static void popOfWorld()
    {
        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    //SQL query
                    "SELECT 'World' AS Name, "
                            + "SUM(c.Population) AS total_population, "
                            + "SUM(city.Population) AS city_Population, "
                            + "(SUM(city.Population) / SUM(c.Population)) * 100 AS city_population_percentage, "
                            + "(SUM(c.Population) - SUM(city.Population)) AS rural_population, "
                            + "((SUM(c.Population) - SUM(city.Population)) / SUM(c.Population)) * 100 AS rural_population_percentage "
                            + "FROM country c "
                            + "LEFT JOIN city ON c.Code = city.CountryCode";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);

            //Report Name
            System.out.println(GREEN + "Population of the world:" + RESET);

            //Print data
            while (rset.next()) {
                long totPop = rset.getLong("total_population");
                long totPopCity = rset.getLong("city_population");
                double totPopCityPer = rset.getDouble("city_population_percentage");
                long totPopRural = rset.getLong("rural_population");
                double totPopUrbCityPer = rset.getDouble("rural_population_percentage");
                //Display
                System.out.println("Total Population: " + totPop);
                System.out.println("City Population: " + totPopCity + " (" + totPopCityPer + "%)");
                System.out.println("Non-City Population: " + totPopRural + " (" + totPopUrbCityPer + "%)");
            }

        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    //------------------ END Method 26 ------------------------------

    //-------------- Method 27 - Population of a Continent ------------------
    //-------------- Angel Ochoa --------------------
    public static void popOfContinent()
    {
        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    //SQL query
                    "SELECT c.Continent AS Name, "
                            + "SUM(c.Population) AS total_population, "
                            + "SUM(city.Population) AS city_Population, "
                            + "(SUM(city.Population) / SUM(c.Population)) * 100 AS city_population_percentage, "
                            + "(SUM(c.Population) - SUM(city.Population)) AS rural_population, "
                            + "((SUM(c.Population) - SUM(city.Population)) / SUM(c.Population)) * 100 AS rural_population_percentage "
                            + "FROM country c "
                            + "LEFT JOIN city ON c.Code = city.CountryCode "
                            + "WHERE c.Continent = 'Asia' "
                            + "GROUP BY c.Continent";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);

            //Report Name
            System.out.println(GREEN + "Population of a Continent:" + RESET);

            //Print data
            while (rset.next()) {
                String cName = rset.getString("Name");
                long totPop = rset.getLong("total_population");
                long totPopCity = rset.getLong("city_population");
                double totPopCityPer = rset.getDouble("city_population_percentage");
                long totPopRural = rset.getLong("rural_population");
                double totPopUrbCityPer = rset.getDouble("rural_population_percentage");
                //Display
                System.out.println("Continent Name: " + cName);
                System.out.println("Total Population: " + totPop);
                System.out.println("City Population: " + totPopCity + " (" + totPopCityPer + "%)");
                System.out.println("Non-City Population: " + totPopRural + " (" + totPopUrbCityPer + "%)");
            }

        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    //------------------ END Method 27 ------------------------------

    //-------------- Method 28 - Population of a region ------------------
    //-------------- Angel Ochoa --------------------
    public static void popOfRegion()
    {
        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    //SQL query
                    "SELECT c.Region AS Name, "
                            + "SUM(c.Population) AS total_population, "
                            + "SUM(city.Population) AS city_Population, "
                            + "(SUM(city.Population) / SUM(c.Population)) * 100 AS city_population_percentage, "
                            + "(SUM(c.Population) - SUM(city.Population)) AS rural_population, "
                            + "((SUM(c.Population) - SUM(city.Population)) / SUM(c.Population)) * 100 AS rural_population_percentage "
                            + "FROM country c "
                            + "LEFT JOIN city ON c.Code = city.CountryCode "
                            + "WHERE c.Region = 'Western Europe' "
                            + "GROUP BY c.Region";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);

            //Report Name
            System.out.println(GREEN + "Population of a Region:" + RESET);

            //Print data
            while (rset.next()) {
                String cName = rset.getString("Name");
                long totPop = rset.getLong("total_population");
                long totPopCity = rset.getLong("city_population");
                double totPopCityPer = rset.getDouble("city_population_percentage");
                long totPopRural = rset.getLong("rural_population");
                double totPopUrbCityPer = rset.getDouble("rural_population_percentage");
                //Display
                System.out.println("Region Name: " + cName);
                System.out.println("Total Population: " + totPop);
                System.out.println("City Population: " + totPopCity + " (" + totPopCityPer + "%)");
                System.out.println("Non-City Population: " + totPopRural + " (" + totPopUrbCityPer + "%)");
            }

        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    //------------------ END Method 28 ------------------------------

    //-------------- Method 29 - Population of a Country ------------------
    //-------------- Angel Ochoa --------------------
    public static void popOfCountry()
    {
        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    //SQL query
                    "SELECT c.name AS Name, "
                            + "c.Population AS total_population, "
                            + "SUM(city.Population) AS city_population, "
                            + "(SUM(city.Population) / SUM(c.Population)) * 100 AS city_population_percentage, "
                            + "(c.Population - SUM(city.Population)) AS rural_population, "
                            + "((c.Population - SUM(city.Population)) / c.Population) * 100 AS rural_population_percentage "
                            + "FROM country c "
                            + "LEFT JOIN city ON c.Code = city.CountryCode "
                            + "WHERE c.name = 'France' "
                            + "GROUP BY c.Name, c.Population";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);

            //Report Name
            System.out.println(GREEN + "Population of a Country:" + RESET);

            //Print data
            while (rset.next()) {
                String cName = rset.getString("Name");
                long totPop = rset.getLong("total_population");
                long totPopCity = rset.getLong("city_population");
                double totPopCityPer = rset.getDouble("city_population_percentage");
                long totPopRural = rset.getLong("rural_population");
                double totPopUrbCityPer = rset.getDouble("rural_population_percentage");
                //Display
                System.out.println("Country Name: " + cName);
                System.out.println("Total Population: " + totPop);
                System.out.println("City Population: " + totPopCity + " (" + totPopCityPer + "%)");
                System.out.println("Non-City Population: " + totPopRural + " (" + totPopUrbCityPer + "%)");
            }

        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    //------------------ END Method 29 ------------------------------

    //-------------- Method 30 - Population of a District ------------------
    //-------------- Angel Ochoa --------------------
    public static void popOfDistrict()
    {
        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    //SQL query
                    "SELECT city.District AS Name, "
                            + "SUM(city.Population) AS total_population, "
                            + "SUM(city.Population) AS city_population, "
                            + "100 AS city_population_percentage, "
                            + "0 AS rural_population, "
                            + "0 AS rural_population_percentage "
                            + "FROM city "
                            + "WHERE city.District = 'California' "
                            + "GROUP BY city.District";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);

            //Report Name
            System.out.println(GREEN + "Population of a District:" + RESET);

            //Print data
            while (rset.next()) {
                String cName = rset.getString("Name");
                long totPop = rset.getLong("total_population");
                long totPopCity = rset.getLong("city_population");
                double totPopCityPer = rset.getDouble("city_population_percentage");
                long totPopRural = rset.getLong("rural_population");
                double totPopUrbCityPer = rset.getDouble("rural_population_percentage");
                //Display
                System.out.println("District Name: " + cName);
                System.out.println("Total Population: " + totPop);
                System.out.println("City Population: " + totPopCity + " (" + totPopCityPer + "%)");
                System.out.println("Non-City Population: " + totPopRural + " (" + totPopUrbCityPer + "%)");
            }

        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    //------------------ END Method 30 ------------------------------

    //-------------- Method 31 - Population of a City ------------------
    //-------------- Angel Ochoa --------------------
    public static void popOfCity()
    {
        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    //SQL query
                    "SELECT city.Name AS Name, "
                            + "city.Population AS total_population, "
                            + "city.Population AS city_population, "
                            + "100 AS city_population_percentage, "
                            + "0 AS rural_population, "
                            + "0 AS rural_population_percentage "
                            + "FROM city "
                            + "WHERE city.Name = 'Tokyo'";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);

            //Report Name
            System.out.println(GREEN + "Population of a City:" + RESET);

            //Print data
            while (rset.next()) {
                String cName = rset.getString("Name");
                long totPop = rset.getLong("total_population");
                long totPopCity = rset.getLong("city_population");
                double totPopCityPer = rset.getDouble("city_population_percentage");
                long totPopRural = rset.getLong("rural_population");
                double totPopUrbCityPer = rset.getDouble("rural_population_percentage");
                //Display
                System.out.println("City Name: " + cName);
                System.out.println("Total Population: " + totPop);
                System.out.println("City Population: " + totPopCity + " (" + totPopCityPer + "%)");
                System.out.println("Non-City Population: " + totPopRural + " (" + totPopUrbCityPer + "%)");
            }

        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    //------------------ END Method 31 ------------------------------

    //-------------- Method 32 - The population that speak Chinese, English, Hindi, Spanish, and Arabic ------------------
    //-------------- Angel Ochoa --------------------
    public static void popOfLang()
    {
        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    //SQL query
                    "SELECT cl.Language, "
                            + "SUM(c.Population * cl.Percentage / 100) AS Speakers, "
                            + "(SUM(c.Population * cl.Percentage / 100) / (SELECT SUM(Population) FROM country)) * 100 AS worldPopPercentage "
                            + "FROM countrylanguage cl "
                            + "JOIN country c ON cl.CountryCode = c.Code "
                            + "WHERE cl.Language IN ('Chinese', 'English', 'Hindi', 'Spanish', 'Arabic') "
                            + "GROUP BY cl.Language "
                            + "ORDER BY Speakers DESC";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);

            //Report Name
            System.out.println(GREEN + "The population that speak Chinese, English, Hindi, Spanish, and Arabic:" + RESET);

            System.out.printf("%-15s %-20s %-20s%n", "Language", "Speakers", "World Population (%)");

            //Print data
            while (rset.next()) {
                String lName = rset.getString("Language");
                long numSpeakers = rset.getLong("Speakers");
                double worldPer = rset.getDouble("worldPopPercentage");
                //Display
                System.out.printf("%-15s %-20d %-20.2f%n", lName, numSpeakers, worldPer);
            }

        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    //------------------ END Method 32 ------------------------------

    //-------------- Method 33 - All Countries by Population ------------------
    //-------------- Angel Ochoa --------------------



    //-------------------------Connect to DB----------------------------
    public static void connect()
    {
        try
        {
            // Load Database driver
            Class.forName("com.mysql.cj.jdbc.Driver");
        }
        catch (ClassNotFoundException e)
        {
            System.out.println("Could not load SQL driver");
            System.exit(-1);
        }

        int retries = 10;
        for (int i = 0; i < retries; ++i)
        {
            System.out.println(BLUE + "Connecting to database..." + RESET);
            try
            {
                // Wait a bit for db to start
                Thread.sleep(30000);
                // Connect to database world in world-db
                con = DriverManager.getConnection("jdbc:mysql://world-db:3306/world?useSSL=false", "root", "p@sswdr00t");
                //conn = con;
                System.out.println(BLUE + "Successfully connected" + RESET);
                break;
            }
            catch (SQLException sqle)
            {
                System.out.println(RED + "Failed to connect to database attempt " + Integer.toString(i) + RESET);
                System.out.println(sqle.getMessage());
            }
            catch (InterruptedException ie)
            {
                System.out.println(RED + "Thread interrupted? Should not happen." + RESET);
            }
        }

    }
    //--------------------END Connect to DB------------------------

    //-------------- Test DB ------------------
    //-------------- Angel Ochoa --------------------
    public static void showWorldDBTables()
    {
        try
        {
            /* Create an SQL statement */
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    /* SQL query */
                    "SHOW TABLES";
            /* Execute SQL statement */
            ResultSet rset = stmt.executeQuery(strSelect);
            System.out.println(GREEN + "Tables for World DB:" + RESET);
            while (rset.next()) {
                System.out.println(rset.getString(1));
            }

        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    //------------------ END Test DB ------------------------------

    //-----------------Disconnect from DB-------------------------
    public static void disconnect()
    {
        if (con != null)
        {
            try
            {
                // Close connection
                con.close();
            }
            catch (Exception e)
            {
                System.out.println(RED + "Error closing connection to database" + RESET);
            }
        }
    }
    //-------------------END Disconnect from DB---------------------------
//}

    //-----------User input for N--------------
    public static int getNum()
    {
        final String RESET = "\u001B[0m";
        final String GREEN = "\u001B[32m";
        final String RED = "\u001B[31m";
        Scanner userEnt = new Scanner(System.in);
        int numEnt = -1;

        while (true) {
            try {
                System.out.print(GREEN + "Enter # of rows to display:" + RESET);
                numEnt = userEnt.nextInt();
                if (numEnt < 0) {
                    System.out.println(RED + "Error: Enter a number starting from '1'." + RESET);
                }
                else {
                    break;
                }
            } catch (Exception e) {
                System.out.println(RED + "Error: Enter a number starting from '1'." + RESET);
                userEnt.nextLine();
            }
        }

        return numEnt;
    }
    // -----------END input for N-------------


}

