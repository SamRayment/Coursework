package Models;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TownCountyService {
    public static TownCounty selectAddress(int id, DatabaseConnection database) {

        TownCounty result = null;

        PreparedStatement statement = database.newStatement("SELECT Street, Town, Postcode  FROM Locations WHERE CarParkID = ? ");

        try {
            if (statement != null) {

                statement.setInt(1, id);
                ResultSet results = database.executeQuery(statement);

                if (results != null) {
                    result = new TownCounty(
                            results.getString("Street"),
                            results.getString("Town"),
                            results.getString("County"),
                            results.getString("Postcode")
                    );}
            }
        } catch (SQLException resultsException) {
            System.out.println("Database select by id error: " + resultsException.getMessage());
        }

        return result;
    }
}


