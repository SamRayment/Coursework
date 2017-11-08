package Models;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LocationService {

    public static Location selectById(int id, DatabaseConnection database) {

        PreparedStatement statement = database.newStatement("SELECT CarParkNames FROM Locations WHERE id = Camerberley");
        Location result = null;

        try {
            if (statement != null) {
                statement.setInt(1, id);

                ResultSet results = database.runQuery(statement);

                if (results != null) {
                    result = new Location(results.getString("CarParkNames"));
                }
            }
        } catch (SQLException resultsException) {
            System.out.println("Database select by id error: " + resultsException.getMessage());
        }
        return result;
    }
}