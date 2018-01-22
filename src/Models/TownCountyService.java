package Models;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TownCountyService {
    public static TownCounty findCounty(int id, DatabaseConnection database) {  //(Line MS1) The method called findCounty, using the model TownCounty and takes the values of id and the database connection

        TownCounty result = null;  //(Line MS2) A variable called result with the data type of TownCounty, and is set as null

        PreparedStatement statement = database.newStatement("SELECT TownCountyId, Town, County FROM TownCounty WHERE TownCountyId = ? "); //(Line MS3) A PreparedStatment called statement and is called statement, and searches for data relating to the TownCountyId

        try {
            if (statement != null) { //(Line MS4) Checks that the value of statement is not null, if true then goes to Line MS5

                statement.setInt(1,id); //(Line MS5) The question mark in the statement on Line MS3 is stored as the value of the variable id
                ResultSet results = database.executeQuery(statement); //(Line MS6) A result set is created called results and stores the value when the query is executed

                if (results != null) { //(Line MS7) Checks that the value of results is not null, if true then goes to Line MS6
                    result = new TownCounty(  //(Line MS8) The values of result with be the variables in the model TownCounty
                            results.getInt("TownCountyId"),  //(Line MS9) The value of TownCountyId is stored in results
                            results.getString("Town"),  //(Line MS10) The value of Town is stored in results
                            results.getString("County")  //(Line MS11) The value of County is stored in results
                    );}
            }
        } catch (SQLException resultsException) {  //(Line MS12) If there are any errors with these if statements then the errors are caught
            System.out.println("Database select by id error: " + resultsException.getMessage());  //(Line MS13) The error is outputted
        }

        return result;  //(Line MS14) The value of result is returned
    }

    public static void selectAll(List<TownCounty> targetList, DatabaseConnection database) { //(Line MS1) A method called selectAll is created taking the values of targetList and the database connection

        PreparedStatement statement = database.newStatement("SELECT TownCountyId, Town, County FROM TownCounty"); //(Line MS2) A PreparedStatment called statement and is called statement, and reads all the data in the table

        try {
            if (statement != null) {  //(Line MS3) Checks that the value of statement is not null, if true then goes to Line MS4

                ResultSet results = database.executeQuery(statement);  //(Line MS4) A result set is created called results and stores the value when the query is executed

                if (results != null) {  //(Line MS5) Checks that the value of results is not null, if true then goes to Line MS6
                    while (results.next()) {  //(Line MS6) Continues to iterate until has gone through all the data
                        targetList.add(new TownCounty(  //(Line MS7) The values will be added to targetList using the variable from the TownCounty model
                                results.getInt("TownCountyId"),  //(Line MS8) The value of TownCountyId is stored in result
                                results.getString("Town"),  //(Line MS9) The value of Town is stored in results
                                results.getString("County")));  //(Line MS10) The value of County is stored in results
                    }
                }
            }
        } catch (SQLException resultsException) {  //(Line MS11) If there are any errors with these if statements then the errors are caught
            System.out.println("Database select all error: " + resultsException.getMessage());  //(Line MS12) The error is outputted
        }
    }



}


