package com.napier.devops;
import java.sql.*;

public class Methods {

    private Connection con = null;

    final String RESET = "\u001B[0m";
    final String BLUE = "\u001B[34m";
    final String GREEN = "\u001B[32m";
    final String RED = "\u001B[31m";

    //-------------- Method 1 - All Countries by Population ------------------
    //-------------- Angel Ochoa --------------------
    public void allCountriesByPop()
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
    public void countriesByContinent()
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
            System.out.println(GREEN + "All Countries by Continent:" + RESET);

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

    //-------------- Method 3 - All Countries by Population ------------------
    //-------------- Angel Ochoa --------------------
    //------------------ END Method 3 ------------------------------

    //-------------- Method 4 - All Countries by Population ------------------
    //-------------- Angel Ochoa --------------------
    //------------------ END Method 4 ------------------------------

    //-------------- Method 5 - All Countries by Population ------------------
    //-------------- Angel Ochoa --------------------
    //------------------ END Method 5 ------------------------------

    //-------------- Method 6 - All Countries by Population ------------------
    //-------------- Angel Ochoa --------------------
    //------------------ END Method 6 ------------------------------

    //-------------- Method 7 - All Countries by Population ------------------
    //-------------- Angel Ochoa --------------------
    //------------------ END Method 7 ------------------------------

    //-------------- Method 8 - All Cities by Continent ------------------
    //-------------- John Chimezie --------------------
    public void citiesByContinent()
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

    //-------------- Method 9 - All Countries by Population ------------------
    //-------------- Angel Ochoa --------------------
    //------------------ END Method 9 ------------------------------

    //-------------- Method 10 - All Countries by Population ------------------
    //-------------- Angel Ochoa --------------------
    //------------------ END Method 10 ------------------------------

    //-------------- Method 11 - All Countries by Population ------------------
    //-------------- Angel Ochoa --------------------
    //------------------ END Method 11 ------------------------------

    //-------------- Method 12 - All Countries by Population ------------------
    //-------------- Angel Ochoa --------------------
    //------------------ END Method 12 ------------------------------

    //-------------- Method 13 - All Countries by Population ------------------
    //-------------- Angel Ochoa --------------------
    //------------------ END Method 13 ------------------------------

    //-------------- Method 14 - All Countries by Population ------------------
    //-------------- Angel Ochoa --------------------
    //------------------ END Method 14 ------------------------------

    //-------------- Method 15 - Top Populated Cities by Region ------------------
    //-------------- Bernard Daniel Young --------------------
    public void topPopCitiesByRegion()
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
                            + "WHERE c.Name = 'United States' "   //United States can be changed to another Country
                            + "ORDER BY ci.Population DESC "
                            + "LIMIT 5";    //limit display
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
    //------------------ END Method 15 ------------------------------

    //-------------- Method 16 - All Countries by Population ------------------
    //-------------- Angel Ochoa --------------------
    //------------------ END Method 16 ------------------------------

    //-------------- Method 17 - All Countries by Population ------------------
    //-------------- Angel Ochoa --------------------
    //------------------ END Method 17 ------------------------------

    //-------------- Method 18 - All Countries by Population ------------------
    //-------------- Angel Ochoa --------------------
    //------------------ END Method 18 ------------------------------

    //-------------- Method 19 - All Countries by Population ------------------
    //-------------- Angel Ochoa --------------------
    //------------------ END Method 19 ------------------------------

    //-------------- Method 20 - All Countries by Population ------------------
    //-------------- Angel Ochoa --------------------
    //------------------ END Method 20 ------------------------------

    //-------------- Method 21 - Top Populated capital Cities by Continent ------------------
    //-------------- Kenneth Ramirez --------------------
    public void topPopCapitalCitiesByContinent()
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
                            + "ORDER BY ci.Population DESC "
                            + "LIMIT 5";    //limit N display
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

    //-------------- Method 22 - All Countries by Population ------------------
    //-------------- Angel Ochoa --------------------
    //------------------ END Method 22 ------------------------------

    //-------------- Method 22 - All Countries by Population ------------------
    //-------------- Angel Ochoa --------------------
    //------------------ END Method 22 ------------------------------

    //-------------- Method 23 - All Countries by Population ------------------
    //-------------- Angel Ochoa --------------------
    //------------------ END Method 23 ------------------------------

    //-------------- Method 24 - All Countries by Population ------------------
    //-------------- Angel Ochoa --------------------
    //------------------ END Method 24 ------------------------------

    //-------------- Method 25 - All Countries by Population ------------------
    //-------------- Angel Ochoa --------------------
    //------------------ END Method 25 ------------------------------

    //-------------- Method 26 - All Countries by Population ------------------
    //-------------- Angel Ochoa --------------------
    //------------------ END Method 26 ------------------------------

    //-------------- Method 27 - All Countries by Population ------------------
    //-------------- Angel Ochoa --------------------
    //------------------ END Method 27 ------------------------------

    //-------------- Method 28 - All Countries by Population ------------------
    //-------------- Angel Ochoa --------------------
    //------------------ END Method 28 ------------------------------

    //-------------- Method 29 - All Countries by Population ------------------
    //-------------- Angel Ochoa --------------------
    //------------------ END Method 29 ------------------------------

    //-------------- Method 30 - All Countries by Population ------------------
    //-------------- Angel Ochoa --------------------
    //------------------ END Method 30 ------------------------------

    //-------------- Method 31 - All Countries by Population ------------------
    //-------------- Angel Ochoa --------------------
    //------------------ END Method 31 ------------------------------

    //-------------- Method 32 - All Countries by Population ------------------
    //-------------- Angel Ochoa --------------------
    //------------------ END Method 32 ------------------------------

    //-------------- Method 33 - All Countries by Population ------------------
    //-------------- Angel Ochoa --------------------
    //------------------ END Method 33 ------------------------------

    //-------------- Method 34 - All Countries by Population ------------------
    //-------------- Angel Ochoa --------------------
    //------------------ END Method 35 ------------------------------

    //-------------- Method 36 - All Countries by Population ------------------
    //-------------- Angel Ochoa --------------------
    //------------------ END Method 36 ------------------------------

    //-------------- Method 37 - All Countries by Population ------------------
    //-------------- Angel Ochoa --------------------
    //------------------ END Method 37 ------------------------------

    //-------------------------Connect to DB----------------------------
    public void connect()
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
    public void showWorldDBTables()
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
    public void disconnect()
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
}
