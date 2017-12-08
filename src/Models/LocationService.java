package Models;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LocationService {
    public static Location selectToLocate(DatabaseConnection database) {

        Location result = null;

        PreparedStatement statement = database.newStatement("SELECT CarParkID  FROM Location WHERE Town = ? AND CCTV = ? AND ElectricParking = ? AND DisabledParking = ? AND ChildParking = ?");

        try {
            if (statement != null) {
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
}