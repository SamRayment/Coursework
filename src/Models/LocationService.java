package Models;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LocationService {
    public static Location selectToLocate(int id, DatabaseConnection database) {

        Location result = null;

        PreparedStatement statement = database.newStatement("SELECT CarParkID,  FROM Locations WHERE Town = ? AND CCTV = ? AND ElectricParking = ? AND DisabledParking = ? AND ChildParking = ?");

        try {
            if (statement != null) {

                statement.setInt(1, id);
                ResultSet results = database.executeQuery(statement);

                if (results != null) {
                    result = new Location(
                            results.getInt("CarParkID"));
                }
            }
        } catch (SQLException resultsException) {
            System.out.println("Database select by id error: " + resultsException.getMessage());
        }

        return result;
    }

    public static Location selectAddress(int id, DatabaseConnection database) {

        Location result = null;

        PreparedStatement statement = database.newStatement("SELECT Street, Town, Postcode  FROM Locations WHERE CarParkID = ? ");

        try {
            if (statement != null) {

                statement.setInt(1, id);
                ResultSet results = database.executeQuery(statement);

                if (results != null) {
                    result = new Location(
                            results.getString("Street"),
                            results.getString("Town"),
                            results.getString("Postcode")
                    );}
            }
        } catch (SQLException resultsException) {
            System.out.println("Database select by id error: " + resultsException.getMessage());
        }

        return result;
    }
}
