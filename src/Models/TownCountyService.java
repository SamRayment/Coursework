package Models;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TownCountyService {
    public static TownCounty findCounty(int id, DatabaseConnection database) {

        TownCounty result = null;

        PreparedStatement statement = database.newStatement("SELECT TownCountyId, Town, County FROM TownCounty WHERE TownCountyId = ? ");

        try {
            if (statement != null) {

                statement.setInt(1, id);
                ResultSet results = database.executeQuery(statement);

                if (results != null) {
                    result = new TownCounty(
                            results.getInt("TownCountyId"),
                            results.getString("Town"),
                            results.getString("County")
                    );}
            }
        } catch (SQLException resultsException) {
            System.out.println("Database select by id error: " + resultsException.getMessage());
        }

        return result;
    }

    public static void selectAll(List<TownCounty> targetList, DatabaseConnection database) {

        PreparedStatement statement = database.newStatement("SELECT TownCountyId, Town, County FROM TownCounty");

        try {
            if (statement != null) {

                ResultSet results = database.executeQuery(statement);

                if (results != null) {
                    while (results.next()) {
                        targetList.add(new TownCounty(
                                results.getInt("TownCountyId"),
                                results.getString("Town"),
                                results.getString("County")));
                    }
                }
            }
        } catch (SQLException resultsException) {
            System.out.println("Database select all error: " + resultsException.getMessage());
        }
    }



}


