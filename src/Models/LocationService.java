package Models;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LocationService {
    public static Location selectToLocate(DatabaseConnection database) {

        Location result = null;

        PreparedStatement statement = database.newStatement("SELECT CarParkID  FROM Locations WHERE TownCountyID = (SELECT TownCountyID FROM TownCounty WHERE Town = ?) AND CCTV = ? AND ElectricParking = ? AND DisabledParking = ? AND ChildParking = ?");

        try {
            if (statement != null) {
                ResultSet results = database.executeQuery(statement);

                if (results != null) {
                    result = new Location(
                            results.getInt("PostcodeID"),
                            results.getString("Street"),
                            results.getInt("TownCountyID"),
                            results.getString("Postcode"),
                            results.getInt("CarParkID"),
                            results.getBoolean("CCTV"),
                            results.getBoolean("ElectricParking"),
                            results.getBoolean("DisabledParking"),
                            results.getBoolean("ChildParking"));

                }
            }
        } catch (SQLException resultsException) {
            System.out.println("Database select by id error: " + resultsException.getMessage());
        }

        return result;
    }
}