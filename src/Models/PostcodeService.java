package Models;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PostcodeService {
    public static Postcodes selectAddress(int id, DatabaseConnection database) {

        Postcodes result = null;

        PreparedStatement statement = database.newStatement("SELECT Town, County, Postcode  FROM  Postcodes WHERE PostcodeID = ? ");

        try {
            if (statement != null) {

                statement.setInt(1, id);
                ResultSet results = database.executeQuery(statement);

                if (results != null) {
                    result = new Postcodes(
                            results.getString("Town"),
                            results.getString("County")
                    );}
            }
        } catch (SQLException resultsException) {
            System.out.println("Database select by id error: " + resultsException.getMessage());
        }

        return result;
    }
}
